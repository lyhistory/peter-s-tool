package io.stormbird.wallet.viewmodel;

import io.stormbird.wallet.R;
import io.stormbird.wallet.ui.BaseActivity;
import io.stormbird.wallet.widget.AWalletBottomNavigationView;

public class BaseNavigationActivity extends BaseActivity implements AWalletBottomNavigationView.OnBottomNavigationItemSelectedListener {
    private AWalletBottomNavigationView nav;

    protected void initBottomNavigation() {
        nav = findViewById(R.id.nav);
        nav.setListener(this);
    }

    protected void selectNavigationItem(int position) {
        nav.setSelectedItem(position);
    }

    @Override
    public boolean onBottomNavigationItemSelected(int index) {
        nav.setSelectedItem(index);
        return false;
    }
}