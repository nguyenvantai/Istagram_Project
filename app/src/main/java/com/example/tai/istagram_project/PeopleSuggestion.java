package com.example.tai.istagram_project;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by TAI on 13/07/2015.
 */
public class PeopleSuggestion extends Activity {
    ListView lvSuggestion;
    private ArrayList<Suggestion> arrSuggestion = null;
    Adapter_ListView_Suggestion myAdapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.people_suggestion);


        lvSuggestion = (ListView) findViewById(R.id.listView2);
        arrSuggestion = new ArrayList<Suggestion>();
        Bitmap icon1 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.image);

        Bitmap icon2 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.following);
        Bitmap icon3 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.bacham);
        Bitmap icon4 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.icon_home);
        Bitmap icon5 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.profile);
        Bitmap icon6 = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.tim3);

        arrSuggestion.add(new Suggestion(icon1, "Van Tai Nguyen", "Nghe An Provinces", icon2, icon3, icon4));
        arrSuggestion.add(new Suggestion(icon5, "Tu Sept", "Nghe An Provinces", icon2, icon3, icon6));
        arrSuggestion.add(new Suggestion(icon5, "Tu Sept", "Nghe An Provinces", icon2, icon3, icon6));
        arrSuggestion.add(new Suggestion(icon1, "Van Tai Nguyen", "Nghe An Provinces", icon2, icon3, icon4));
        arrSuggestion.add(new Suggestion(icon1, "Van Tai Nguyen", "Nghe An Provinces", icon2, icon3, icon4));
        arrSuggestion.add(new Suggestion(icon1, "Van Tai Nguyen", "Nghe An Provinces", icon2, icon3, icon4));


        myAdapter = new Adapter_ListView_Suggestion(this.getApplication(), arrSuggestion);

        lvSuggestion.setAdapter(myAdapter);


    }
    public void onClickComeBack11( View v){
        finish();
    }
}
