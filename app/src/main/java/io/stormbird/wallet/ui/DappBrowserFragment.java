package io.stormbird.wallet.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;
import io.stormbird.token.tools.Numeric;
import io.stormbird.wallet.BuildConfig;
import io.stormbird.wallet.R;
import io.stormbird.wallet.entity.DAppFunction;
import io.stormbird.wallet.entity.NetworkInfo;
import io.stormbird.wallet.entity.Wallet;
import io.stormbird.wallet.viewmodel.DappBrowserViewModel;
import io.stormbird.wallet.viewmodel.DappBrowserViewModelFactory;
import io.stormbird.wallet.web3.OnSignMessageListener;
import io.stormbird.wallet.web3.OnSignPersonalMessageListener;
import io.stormbird.wallet.web3.OnSignTransactionListener;
import io.stormbird.wallet.web3.OnSignTypedMessageListener;
import io.stormbird.wallet.web3.OnVerifyListener;
import io.stormbird.wallet.web3.Web3View;
import io.stormbird.wallet.web3.entity.Address;
import io.stormbird.wallet.web3.entity.Message;
import io.stormbird.wallet.web3.entity.Transaction;
import io.stormbird.wallet.web3.entity.TypedData;
import io.stormbird.wallet.widget.SignMessageDialog;


public class DappBrowserFragment extends Fragment implements
        OnSignTransactionListener, OnSignPersonalMessageListener, OnSignTypedMessageListener, OnSignMessageListener, OnVerifyListener {
    private static final String TAG = DappBrowserFragment.class.getSimpleName();
    private static final String ETH_RPC_URL = "https://mainnet.infura.io/llyrtzQ3YhkdESt2Fzrk";
    private static final String XCONTRACT_URL = "https://xcontract.herokuapp.com/sign";

    @Inject
    DappBrowserViewModelFactory dappBrowserViewModelFactory;
    private DappBrowserViewModel viewModel;

    private Web3View web3;
    private EditText urlText;
    private ProgressBar progressBar;
    private Wallet wallet;
    private NetworkInfo networkInfo;
    private SignMessageDialog dialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        View view = inflater.inflate(R.layout.fragment_webview, container, false);
        initView(view);
        initViewModel();
        return view;
    }

    private void initView(View view) {
        web3 = view.findViewById(R.id.web3view);
        progressBar = view.findViewById(R.id.progressBar);
        urlText = view.findViewById(R.id.url);

        urlText.setText(XCONTRACT_URL);
        urlText.setOnEditorActionListener((v, actionId, event) -> {
            boolean handled = false;
            if (actionId == EditorInfo.IME_ACTION_GO) {
                web3.loadUrl(urlText.getText().toString());
                web3.requestFocus();
                InputMethodManager imm = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(urlText.getWindowToken(), 0);
                handled = true;
            }
            return handled;
        });
    }

    private void initViewModel() {
        viewModel = ViewModelProviders.of(this, dappBrowserViewModelFactory)
                .get(DappBrowserViewModel.class);
        viewModel.defaultNetwork().observe(this, this::onDefaultNetwork);
        viewModel.defaultWallet().observe(this, this::onDefaultWallet);
    }

    private void onDefaultWallet(Wallet wallet) {
        this.wallet = wallet;
        setupWeb3();

        // Default to XContract
        web3.loadUrl(XCONTRACT_URL);
    }

    private void onDefaultNetwork(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    private void setupWeb3() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(BuildConfig.DEBUG);
        }
        web3.setChainId(1);
        web3.setRpcUrl(ETH_RPC_URL);
        web3.setWalletAddress(new Address(wallet.address));

        web3.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView webview, int newProgress) {
                if (newProgress == 100) {
                    progressBar.setVisibility(View.GONE);
                } else {
                    progressBar.setVisibility(View.VISIBLE);
                    progressBar.setProgress(newProgress);
                }
            }

            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
            }
        });

        web3.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                urlText.setText(url);
                return false;
            }
        });

        web3.setOnSignMessageListener(this);
        web3.setOnSignPersonalMessageListener(this);
        web3.setOnSignTransactionListener(this);
        web3.setOnSignTypedMessageListener(this);
        web3.setOnVerifyListener(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.prepare();
    }

    @Override
    public void onSignMessage(Message<String> message) {
        DAppFunction dAppFunction = new DAppFunction() {
            @Override
            public void DAppError(Throwable error, Message<String> message) {
                web3.onSignCancel(message);
                dialog.dismiss();
            }

            @Override
            public void DAppReturn(byte[] data, Message<String> message) {
                String signHex = Numeric.toHexString(data);
                Log.d(TAG, "Initial Msg: " + message.value);
                web3.onSignMessageSuccessful(message, signHex);
                dialog.dismiss();
            }
        };

        dialog = new SignMessageDialog(getActivity(), message);
        dialog.setAddress(wallet.address);
        dialog.setOnApproveListener(v -> {

            viewModel.signMessage(message.value, dAppFunction, message);
        });
        dialog.setOnRejectListener(v -> {
            web3.onSignCancel(message);
            dialog.dismiss();
        });
        dialog.show();
    }

    @Override
    public void onSignPersonalMessage(Message<String> message) {
        //TODO
        Toast.makeText(getActivity(), message.value, Toast.LENGTH_LONG).show();
        web3.onSignCancel(message);
    }

    @Override
    public void onSignTypedMessage(Message<TypedData[]> message) {
        //TODO
        Toast.makeText(getActivity(), new Gson().toJson(message), Toast.LENGTH_LONG).show();
        web3.onSignCancel(message);
    }

    @Override
    public void onSignTransaction(Transaction transaction) {
        //TODO
        String str = new StringBuilder()
                .append(transaction.recipient == null ? "" : transaction.recipient.toString()).append(" : ")
                .append(transaction.contract == null ? "" : transaction.contract.toString()).append(" : ")
                .append(transaction.value.toString()).append(" : ")
                .append(transaction.gasPrice.toString()).append(" : ")
                .append(transaction.gasLimit).append(" : ")
                .append(transaction.nonce).append(" : ")
                .append(transaction.payload).append(" : ")
                .toString();
        Toast.makeText(getActivity(), str, Toast.LENGTH_LONG).show();
        web3.onSignCancel(transaction);
    }

    @Override
    public void onVerify(String message, String signHex) {
        web3.onVerify(viewModel.getRecoveredAddress(message, signHex), viewModel.getVerificationResult(getContext(), wallet, message, signHex));

    }
}
