package com.example.tai.istagram_project;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.TextView;

public class CustomAdapter extends FragmentStatePagerAdapter {
	ArrayList<Fragment> fragment;

	public CustomAdapter(FragmentManager fm, ArrayList<Fragment> fragment) {
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


		
		}
		return null;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		switch (position) {
		case 0:
			return "FOLLOWING";

		case 1:

			return "YOU";

		}
		return super.getPageTitle(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

}
