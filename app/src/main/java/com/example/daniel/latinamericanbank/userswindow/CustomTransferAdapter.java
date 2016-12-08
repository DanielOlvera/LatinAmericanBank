package com.example.daniel.latinamericanbank.userswindow;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daniel.latinamericanbank.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Daniel on 12/7/16.
 */

public class CustomTransferAdapter extends RecyclerView.Adapter<CustomTransferAdapter.ViewHolder> {

    private static final String TAG = "TransferAdapterTAG_";
    private String[] transfer_rows = {"Person2Person", "My LBA Accounts", "Other Banks"};

    private int position;

    /*public CustomTransferAdapter(String[] transfer_rows) {
        this.transfer_rows = transfer_rows;
    }*/

    @Override
    public CustomTransferAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.fragment_recycler_transfer_row, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        Log.d(TAG, "onCreateViewHolder: " + viewHolder);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomTransferAdapter.ViewHolder holder, int position) {
        holder.transferTextVwName.setText(transfer_rows[position]);
        Log.d(TAG, String.format("onBindViewHolder: " + position));
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: " + transfer_rows.length);
        return transfer_rows.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.frtr_textVwName)
        TextView transferTextVwName;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            Log.d(TAG, "ViewHolder: " + itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    position = getAdapterPosition();
                    Log.d(TAG, "onClick: " + position);

                    //TODO: Place here a switch for the position that every tab will send
                }
            });
        }
    }
}
