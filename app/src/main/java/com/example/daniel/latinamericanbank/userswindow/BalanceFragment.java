package com.example.daniel.latinamericanbank.userswindow;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.daniel.latinamericanbank.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BalanceFragment extends Fragment {


    public BalanceFragment() {
        // Required empty public constructor
    }

    public static BalanceFragment newInstance(){
        BalanceFragment balanceFragment = new BalanceFragment();
        return balanceFragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_balance, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.balance_menu, menu);
        //super.onCreateOptionsMenu(menu, inflater);
    }
}