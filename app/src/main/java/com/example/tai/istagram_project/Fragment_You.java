package com.example.tai.istagram_project;

/**
 * Created by TAI on 04/07/2015.
 */

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Fragment_You extends Fragment {
    ListView lvPerson;
    private ArrayList<You> arrYou = null;
    Adapter_ListView_You myAdapter = null;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    ImageView imageButton;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        final View v = inflater.inflate(R.layout.fragment_you, container, false);

        imageButton = (ImageView)v.findViewById(R.id.imageButton);
        lvPerson = (ListView) v.findViewById(R.id.listView);
        arrYou = new ArrayList<You>();
        Bitmap icon1 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.image);
        Bitmap icon2 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.image);
        Bitmap icon3 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.h1);
        Bitmap icon4 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.girl);



        arrYou.add(new You(icon1, "Nguyen Van Tai are started following you", icon3));
        arrYou.add(new You(icon4, "Tuan Tu is on Facebook started following you", icon3));
        arrYou.add(new You(icon1, "Magane is on Facebook in Istagram  started following you", icon3));
        arrYou.add(new You(icon1, "Nguyen Tuan Tu is on Facebook in Istagram  started following you", icon3));
        arrYou.add(new You(icon4, "Magane is on Facebook in Istagram  started following you", icon3));
        arrYou.add(new You(icon4, "Tu Sept is on Facebook in Istagram  started following you", icon3));
        arrYou.add(new You(icon1, "Hoang Manh Hung is on Facebook in Istagram  started following you", icon3));
        arrYou.add(new You(icon1, "Magane is on Facebook in Istagram  started following you", icon3));
        arrYou.add(new You(icon1, "Magane is on Facebook in Istagram  started following you", icon3));
        arrYou.add(new You(icon4, "Magane is on Facebook in Istagram  started following you", icon3));
        arrYou.add(new You(icon4, "Thu Thao is on Facebook in Istagram  started following you", icon3));
        arrYou.add(new You(icon1, "Hoa Hau Ki Duyen is on Facebook in Istagram  started following you", icon3));





        myAdapter = new Adapter_ListView_You(v.getContext(), arrYou);

        lvPerson.setAdapter(myAdapter);





        mSwipeRefreshLayout = (SwipeRefreshLayout) v.findViewById(R.id.srl_container);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(v.getContext(), "Loading...", Toast.LENGTH_SHORT).show();
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });
        mSwipeRefreshLayout.setColorScheme(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        return v;
    }
    public void onClickChangeButton( View v){



    }

}
