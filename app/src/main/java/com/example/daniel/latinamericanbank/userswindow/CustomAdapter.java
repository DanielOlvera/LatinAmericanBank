package com.example.daniel.latinamericanbank.userswindow;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daniel.latinamericanbank.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Daniel on 11/27/16.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private static final String TAG = "CustomAdapterTAG_";
    ArrayList<UserPayments> userPaymentsList;

    public CustomAdapter(ArrayList<UserPayments> userPayments) {
        this.userPaymentsList = userPayments;
    }

    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.fragment_recycler_pay_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        Log.d(TAG, "onCreateViewHolder: " + viewHolder);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        holder.payTextViewName.setText(userPaymentsList.get(position).namePaid);
        holder.payTextViewAmmount.setText(userPaymentsList.get(position).ammountPaid);
        holder.payImageView.setImageResource(userPaymentsList.get(position).photoId);
        Log.d(TAG, "onBindViewHolder: " + position);
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: " + userPaymentsList.size() + userPaymentsList.get(1));
        return userPaymentsList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        Log.d(TAG, "onAttachedToRecyclerView: " + recyclerView);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.frpr_cardVw)
        CardView payCardView;
        @BindView(R.id.frpr_textVwName)
        TextView payTextViewName;
        @BindView(R.id.frpr_textVwAmmount)
        TextView payTextViewAmmount;
        @BindView(R.id.frpr_imageVw)
        ImageView payImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            Log.d(TAG, "ViewHolder: " + itemView);
        }
    }
}
