package com.example.daniel.latinamericanbank.userswindow;

import com.example.daniel.latinamericanbank.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 11/27/16.
 */

public class UserPayments {

    String namePaid;
    String ammountPaid;
    int photoId;

    private List<UserPayments> userPayments;

    public UserPayments(String namePaid, String ammountPaid, int photoId) {
        this.namePaid = namePaid;
        this.ammountPaid = ammountPaid;
        this.photoId = photoId;
    }

    private void initializeData(){
        userPayments = new ArrayList<>();

        userPayments.add(new UserPayments("Pepe Romero", "25", R.mipmap.pay_success));
        userPayments.add(new UserPayments("Abe Mercado", "50", R.mipmap.pay_processing));
        userPayments.add(new UserPayments("Beto Bernal", "100", R.mipmap.pay_rejected));
    }
}
