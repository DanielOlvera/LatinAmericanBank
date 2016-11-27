package com.example.daniel.latinamericanbank.userswindow;

import android.graphics.Color;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.daniel.latinamericanbank.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserWindowActivity extends AppCompatActivity {

    @BindView(R.id.auw_viewPgr)
    ViewPager viewPager;
    @BindView(R.id.auw_pagrTabStrp)
    PagerTabStrip pagerTabStrip;
    @BindView(R.id.auw_userName)
    TextView userName;
    FragmentPagerAdapter fragmentPagerAdapter;

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
        userName.setText("Welcome " + FAKE_USER);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
