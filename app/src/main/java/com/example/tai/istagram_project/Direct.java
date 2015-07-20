package com.example.tai.istagram_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by TAI on 08/07/2015.
 */
public class Direct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.direct);
    }
    public void onClickBack(View v){

//        Intent intent = new Intent(Direct.this,HomeActivity.class);
//        startActivity(intent);
        finish();
    }
    public  void onClickCamera(View v){
        Intent intent = new Intent(Direct.this,AndroidCameraExample.class);
        startActivity(intent);
    }
}
