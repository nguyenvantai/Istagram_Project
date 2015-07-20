package com.example.tai.istagram_project;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by TAI on 08/07/2015.
 */
public class OptionActivity extends Activity {
    ImageView image,image1,image3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_layout);
        image = (ImageView)findViewById(R.id.imgButton);
        image1 = (ImageView)findViewById(R.id.imgButton2);
        image3 =(ImageView)findViewById(R.id.imgButton3);
       // final Drawable mDrawable = this.getResources().getDrawable(R.drawable.button_blue);
    }
    public void onClickComeBack( View v){
        finish();
    }
    public void onCLickChange( View v){
        final Drawable mDrawable = this.getResources().getDrawable(R.drawable.button_blue);
        image.setImageDrawable(mDrawable);
    }
    public void onCLickChange1( View v){
        final Drawable mDrawable = this.getResources().getDrawable(R.drawable.button_blue);
        image1.setImageDrawable(mDrawable);
    }
    public void onCLickChange2( View v){
        final Drawable mDrawable = this.getResources().getDrawable(R.drawable.button_blue);
        image3.setImageDrawable(mDrawable);
    }
}
