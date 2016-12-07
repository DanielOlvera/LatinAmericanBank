package com.example.daniel.latinamericanbank.userswindow;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daniel.latinamericanbank.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class TransferFragment extends Fragment {

    @BindView(R.id.ft_recyclerView)
    RecyclerView transferRecyclerVw;
    @BindView(R.id.ft_textVw)
    TextView transferTextVw;

    private Unbinder unbinder;
    private CustomTransferAdapter customAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public TransferFragment() {
        // Required empty public constructor
    }

    public static TransferFragment newInstance(){
        TransferFragment transferFragment = new TransferFragment();
        return transferFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_transfer, container, false);
        View view = inflater.inflate(R.layout.fragment_transfer, container, false);
        unbinder = ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);

        transferTextVw.setText("Test onCreateVw");

        transferRecyclerVw.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getContext());
        transferRecyclerVw.setLayoutManager(layoutManager);

        customAdapter = new CustomTransferAdapter();
        transferRecyclerVw.setAdapter(customAdapter);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.transfer_menu, menu);
        //super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
