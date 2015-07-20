package com.example.tai.istagram_project;

import android.app.Activity;
import android.os.Bundle;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

public class HeartActivity extends FragmentActivity {
    ArrayList<Fragment> fragment;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heart_layout);

        fragment = new ArrayList<Fragment>();
        fragment.add(new Fragment_Following());
        fragment.add(new Fragment_You());


        CustomAdapter adapter = new CustomAdapter(getSupportFragmentManager(), fragment);
        viewPager = (ViewPager) this.findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        SlidingTabLayout tab = (SlidingTabLayout) findViewById(R.id.slidingTablayout);
        tab.setDistributeEvenly(true);
        tab.setViewPager(viewPager);
    }
}
