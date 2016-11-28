package com.example.daniel.latinamericanbank.userswindow;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daniel.latinamericanbank.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Daniel on 11/27/16.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    List<UserPayments> userPayments;

    public CustomAdapter(List<UserPayments> userPayments) {
        this.userPayments = userPayments;
    }

    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.fragment_recycler_pay_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        holder.payTextViewName.setText(userPayments.get(position).namePaid);
        holder.payTextViewAmmount.setText(userPayments.get(position).ammountPaid);
        holder.payImageView.setImageResource(userPayments.get(position).photoId);
    }

    @Override
    public int getItemCount() {
        return userPayments.size();
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
        }
    }
}
