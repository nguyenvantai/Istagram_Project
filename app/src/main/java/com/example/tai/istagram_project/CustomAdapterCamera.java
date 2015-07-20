package com.example.tai.istagram_project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by TAI on 14/07/2015.
 */
public class CustomAdapterCamera extends FragmentStatePagerAdapter{


        ArrayList<Fragment> fragment;

        public CustomAdapterCamera(FragmentManager fm, ArrayList<Fragment> fragment) {
            super(fm);
            // TODO Auto-generated constructor stub
            this.fragment = fragment;
        }

        @Override
        public Fragment getItem(int possition) {
            // TODO Auto-generated method stub
            switch (possition) {
                case 0:
                    return 	this.fragment.get(0);
                case 1:
                    return 	this.fragment.get(1);
                case 2:
                    return 	this.fragment.get(2);


            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // TODO Auto-generated method stub
            switch (position) {
                case 0:

                    return "GALLERY";
                case 1:

                    return "PHOTO";
                case 2:

                    return "VIDEO";

            }
            return super.getPageTitle(position);
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return 3;
        }

    }

