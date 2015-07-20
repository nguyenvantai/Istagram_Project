package com.example.tai.istagram_project;

/**
 * Created by TAI on 07/07/2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;



import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends Activity {
    ListView lvHome;
    private ArrayList<Home> arrHome = null;
    Adapter_ListView_Home myAdapter_Home = null;
    ImageButton imgTable;
    ImageView imageHeart;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        lvHome = (ListView) findViewById(R.id.lvHome);
        arrHome = new ArrayList<Home>();
         imgTable =(ImageButton) findViewById(R.id.table);
        imageHeart = (ImageView)findViewById(R.id.imageHeart);

        Bitmap icon1 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.girl);
        Bitmap icon2 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.icon_home);
        Bitmap icon3 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.t1);
        Bitmap icon4 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.t2);
        Bitmap icon5 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.bacham1);
        Bitmap icon6 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.blue_heart);
        Bitmap icon7 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.pic1);Bitmap icon8 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.pic2);

        arrHome.add( new Home(icon1, "Van Tai Nguyen", "3h", icon2, icon3, icon4, icon5, icon6, "65"));
        arrHome.add( new Home(icon1, "Tu Sept", "1day", icon2,icon3, icon4, icon5, icon6,"132"));
        arrHome.add( new Home(icon1, "Tu Sept", "12h", icon2,icon3, icon4, icon5, icon6,"13203"));
        myAdapter_Home = new Adapter_ListView_Home(this, arrHome);

        lvHome.setAdapter(myAdapter_Home);


    }
    public void onClickImageButton( View v){
        Intent intent = new Intent(HomeActivity.this,Direct.class);
        startActivity(intent);

    }
    public void setUpAnimation(final Animation animation,View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageHeart.startAnimation(animation);
            }
        });

    }
}

