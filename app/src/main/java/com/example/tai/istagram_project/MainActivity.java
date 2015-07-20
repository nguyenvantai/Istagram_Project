package com.example.tai.istagram_project;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost tabHost = getTabHost();

        
        // Tab for Photos
        TabSpec homespec = tabHost.newTabSpec("Home");
        homespec.setIndicator(null, getResources().getDrawable(R.drawable.drawable_home));
        Intent homeIntent = new Intent(this, HomeActivity.class);
        homespec.setContent(homeIntent);
        
        // Tab for Songs
        TabSpec searchspec = tabHost.newTabSpec("Search");
        // setting Title and Icon for the Tab
        searchspec.setIndicator(null, getResources().getDrawable(R.drawable.drawable_search));
        Intent searchIntent = new Intent(this, SearchActivity.class);
        searchspec.setContent(searchIntent);
        
        // Tab for Videos
        TabSpec cameraspec = tabHost.newTabSpec("Camera");
        cameraspec.setIndicator(null, getResources().getDrawable(R.drawable.drawable_camera));
        Intent cameraIntent = new Intent(this, AndroidCameraExample.class);
            cameraspec.setContent(cameraIntent);

        TabSpec heartspec = tabHost.newTabSpec("Heart");
            heartspec.setIndicator(null, getResources().getDrawable(R.drawable.drawble_heart));
        Intent heartIntent = new Intent(this, HeartActivity.class);
            heartspec.setContent(heartIntent);

        TabSpec peoplespec = tabHost.newTabSpec("People");
        peoplespec.setIndicator(null, getResources().getDrawable(R.drawable.drawable_people));
        Intent peopleIntent = new Intent(this, PeopleActivity.class);
        peoplespec.setContent(peopleIntent);
        // Adding all TabSpec to TabHost
        tabHost.addTab(homespec);
        tabHost.addTab(searchspec);
        tabHost.addTab(cameraspec);
        tabHost.addTab(heartspec);
        tabHost.addTab(peoplespec);
            tabHost.getTabWidget().setDividerDrawable(null);



    }




}
