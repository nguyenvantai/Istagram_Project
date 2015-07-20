package com.example.tai.istagram_project;

import java.util.ArrayList;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter_ListView_You extends BaseAdapter {
    private Context mContext;
    private ArrayList<You> mYou;

    public Adapter_ListView_You(Context context, ArrayList<You> you) {
        mContext = context;
        mYou = you;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mYou.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mYou.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    private static class ViewHolder {
        ImageView avata;
        TextView notifi;
        ImageView bitmap;

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.custom_listview_you, parent, false);
            holder = new ViewHolder();

            holder.avata = (ImageView) convertView.findViewById(R.id.imageView);
            holder.notifi = (TextView) convertView.findViewById(R.id.textView2);
            holder.bitmap = (ImageView) convertView.findViewById(R.id.imageButton);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        You sg = (You) getItem(position);
        holder.avata.setImageBitmap(sg.getAvatar());
        holder.notifi.setText(sg.getNotify());
        holder.bitmap.setImageBitmap(sg.getFollowing());
       final Drawable mDrawable = mContext.getResources().getDrawable(R.drawable.following);
       final  Drawable nDrawable = mContext.getResources().getDrawable(R.drawable.h1);

//        Bitmap i1 = BitmapFactory.decodeResource(mContext.getResources(),
//                R.drawable.following);
//        Bitmap i2 = BitmapFactory.decodeResource(mContext.getResources(),
//                R.drawable.h1);

        holder.bitmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Boolean isPress = true;
                if(isPress) {

                    holder.bitmap.setImageDrawable(mDrawable);
                    isPress= false;
                }
                else
                {
                    holder.bitmap.setImageDrawable(nDrawable);
                    isPress= true;

                }


            }
        });


        return convertView;
    }
}

