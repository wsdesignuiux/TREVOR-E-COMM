package com.wolfsoft.datingapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wolfsoft.datingapp.R;

import adapter.ViewpagerAdapter;
import me.relex.circleindicator.CircleIndicator;

public class WalkthroughActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private ViewpagerAdapter viewpagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        circleIndicator = (CircleIndicator) findViewById(R.id.circleindicator);

        viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewpagerAdapter);
        circleIndicator.setViewPager(viewPager);
        viewpagerAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());

    }
}
