package com.example.tai.istagram_project;

/**
 * Created by TAI on 04/07/2015.
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Fragment_Following extends Fragment{
    ListView lvImage;
    private ArrayList<Image> arrImage = null;
    Adapter_ListView_Following myAdapter_following = null;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        final View v = inflater.inflate(R.layout.fragment_following, container, false);

        lvImage =(ListView) v.findViewById(R.id.listViewFollowing);
        arrImage = new ArrayList<Image>();
        Bitmap icon0 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.image);
        Bitmap icon00 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.girl);

        Bitmap icon1 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.image_following1);
        Bitmap icon2 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.image_following2);
        Bitmap icon3 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.image_following3);
        arrImage.add(new Image(icon0,"nguyenvantai","1d",icon1));
        arrImage.add(new Image(icon00,"nguyen cao ki duyen","43s",icon2));
        arrImage.add(new Image(icon00,"tu sept","13h",icon3));
        arrImage.add(new Image(icon0,"Meo Luoi","1d",icon3));
        arrImage.add(new Image(icon00,"Linh Vo","22h",icon2));
        arrImage.add(new Image(icon0,"nguyen tuan anh","1d",icon1));




        myAdapter_following = new Adapter_ListView_Following(v.getContext(), arrImage);

        lvImage.setAdapter(myAdapter_following);

        mSwipeRefreshLayout = (SwipeRefreshLayout) v.findViewById(R.id.swipeRefreshLayout);
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

}
