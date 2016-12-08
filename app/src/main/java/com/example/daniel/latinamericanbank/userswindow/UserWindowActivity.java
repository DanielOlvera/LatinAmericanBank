package com.example.daniel.latinamericanbank.userswindow;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daniel.latinamericanbank.LoginActivity;
import com.example.daniel.latinamericanbank.R;
import com.example.daniel.latinamericanbank.paywindow.NewPayActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserWindowActivity extends AppCompatActivity {

    @BindView(R.id.auw_viewPgr)
    ViewPager viewPager;
    @BindView(R.id.auw_pagrTabStrp)
    PagerTabStrip pagerTabStrip;
    @BindView(R.id.auw_userName)
    TextView userName;

    private FragmentPagerAdapter fragmentPagerAdapter;
    private SharedPreferences sharedPreferences;

    private static final String FAKE_USER = "Pedro Páramo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_window);
        ButterKnife.bind(this);

        //Modifying pager strip color
        pagerTabStrip.setDrawFullUnderline(true);
        pagerTabStrip.setTabIndicatorColor(Color.RED);

        //Here is were the view pager will be inflated
        fragmentPagerAdapter = new UserFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);

        //Here is inflated the text view
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String usrName = sharedPreferences.getString(LoginActivity.PREF_USER, "").toString();
        userName.setText("Welcome, " + usrName);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.pm_payMenu:
                Intent intent = new Intent(this, NewPayActivity.class);
                startActivity(intent);
                Toast.makeText(this, "New Payment Menu", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.tm_transfermenu:
                Toast.makeText(this, "New Transfer Menu", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.bm_balanceMenu:
                Toast.makeText(this, "Account Balance Menu", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
