package com.example.daniel.latinamericanbank.userswindow;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Daniel on 11/26/16.
 */

public class UserFragmentAdapter extends FragmentPagerAdapter {

    private static int NUM_TABS = 3;
    public static final String UI_TAB_PAY = "Payments";
    public static final String UI_TAB_TRANS = "Transfers";
    public static final String UI_TAB_BAL = "Balance";

    public UserFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PayFragment.newInstance();
            case 1:
                return TransferFragment.newInstance();
            case 2:
                return BalanceFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return NUM_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return UI_TAB_PAY;
            case 1:
                return UI_TAB_TRANS;
            case 2:
                return UI_TAB_BAL;
        }
        return super.getPageTitle(position);
    }
}
