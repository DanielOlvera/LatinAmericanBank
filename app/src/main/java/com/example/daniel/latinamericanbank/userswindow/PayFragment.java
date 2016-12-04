package com.example.daniel.latinamericanbank.userswindow;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daniel.latinamericanbank.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class PayFragment extends Fragment {

    private static final String TAG = "PayFragmentTAG_";

    @BindView(R.id.fp_recyclerView)
    RecyclerView payRecyclerView;
    @BindView(R.id.fp_textVw)
    TextView testTextVw;

    private Unbinder unbinder;
    private CustomAdapter customAdapter;
    private ArrayList<UserPayments> userPayments;
    private RecyclerView.LayoutManager rcyclrLayoutManager;

    public PayFragment() {
        // Required empty public constructor
    }

    public static PayFragment newInstance(){
        PayFragment payFragment = new PayFragment();
        return payFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeData();
        Log.d(TAG, "onCreate: " );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_pay, container, false);
        View view = inflater.inflate(R.layout.fragment_pay, container, false);
        unbinder = ButterKnife.bind(this, view);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);

        testTextVw.setText("Test onCreateView");

        payRecyclerView.setHasFixedSize(true);

        rcyclrLayoutManager = new LinearLayoutManager(getContext());
        payRecyclerView.setLayoutManager(rcyclrLayoutManager);

        customAdapter = new CustomAdapter(userPayments);
        payRecyclerView.setAdapter(customAdapter);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.pay_menu, menu);
        //super.onCreateOptionsMenu(menu, inflater);
        Log.d(TAG, "onCreateOptionsMenu: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        Log.d(TAG, "onDestroy: ");
    }

    private void initializeData(){
        userPayments = new ArrayList<>();

        userPayments.add(new UserPayments("Pepe Romero", "25", R.mipmap.pay_success));
        userPayments.add(new UserPayments("Abe Mercado", "50", R.mipmap.pay_processing));
        userPayments.add(new UserPayments("Beto Bernal", "100", R.mipmap.pay_rejected));

        Log.d(TAG, "initializeData: " + userPayments);
    }
}
