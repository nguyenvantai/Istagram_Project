package com.example.tai.istagram_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class SearchActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_layout);
    }
    public  void onClickPeopleSuggestion( View v){
        Intent i = new Intent(SearchActivity.this,PeopleSuggestion.class);
        startActivity(i);

    }
}
