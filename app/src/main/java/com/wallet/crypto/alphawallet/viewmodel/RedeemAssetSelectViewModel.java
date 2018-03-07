package com.wallet.crypto.alphawallet.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;

import com.wallet.crypto.alphawallet.entity.NetworkInfo;
import com.wallet.crypto.alphawallet.entity.Ticket;
import com.wallet.crypto.alphawallet.entity.Wallet;
import com.wallet.crypto.alphawallet.interact.FindDefaultNetworkInteract;
import com.wallet.crypto.alphawallet.interact.FindDefaultWalletInteract;
import com.wallet.crypto.alphawallet.router.AssetDisplayRouter;
import com.wallet.crypto.alphawallet.router.RedeemSignatureDisplayRouter;
import com.wallet.crypto.alphawallet.ui.widget.entity.TicketRange;

/**
 * Created by James on 27/02/2018.
 */

public class RedeemAssetSelectViewModel extends BaseViewModel
{
    private final FindDefaultWalletInteract findDefaultWalletInteract;
    private final FindDefaultNetworkInteract findDefaultNetworkInteract;
    private final RedeemSignatureDisplayRouter redeemSignatureDisplayRouter;

    private final MutableLiveData<Ticket> ticket = new MutableLiveData<>();
    private final MutableLiveData<NetworkInfo> defaultNetwork = new MutableLiveData<>();
    private final MutableLiveData<Wallet> defaultWallet = new MutableLiveData<>();


    public RedeemAssetSelectViewModel(
            FindDefaultWalletInteract findDefaultWalletInteract,
            FindDefaultNetworkInteract findDefaultNetworkInteract,
            RedeemSignatureDisplayRouter redeemSignatureDisplayRouter) {
        this.findDefaultWalletInteract = findDefaultWalletInteract;
        this.findDefaultNetworkInteract = findDefaultNetworkInteract;
        this.redeemSignatureDisplayRouter = redeemSignatureDisplayRouter;
    }

    public void prepare() {
        disposable = findDefaultNetworkInteract
                .find()
                .subscribe(this::onDefaultNetwork, this::onError);
    }

    private void onDefaultNetwork(NetworkInfo networkInfo) {
        defaultNetwork.postValue(networkInfo);
        disposable = findDefaultWalletInteract
                .find()
                .subscribe(this::onDefaultWallet, this::onError);
    }

    private void onDefaultWallet(Wallet wallet) {
        defaultWallet.setValue(wallet);
    }

    public void showRedeemSignature(Context ctx, TicketRange range, Ticket ticket)
    {
        redeemSignatureDisplayRouter.open(ctx, defaultWallet.getValue(), ticket, range);
    }
}