package com.example.tai.istagram_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class PeopleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people_layout);
    }
    public void onClickOption( View v){
        Intent intent = new Intent(PeopleActivity.this,OptionActivity.class);
        startActivity(intent);


    }
    public void onClickThanh( View v){
        Intent intent1 = new Intent(PeopleActivity.this,People2Activity.class);
        startActivity(intent1);
    }
}
