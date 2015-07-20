package com.example.tai.istagram_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by TAI on 13/07/2015.
 */
public class People2Activity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people2_layout);
    }
    public void onClickHinhvuong( View v){
        finish();
    }
    public void onClickOption( View v){
        Intent intent = new Intent(People2Activity.this,OptionActivity.class);
        startActivity(intent);
    }
}
