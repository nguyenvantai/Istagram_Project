package com.example.tai.istagram_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter_ListView_Following extends BaseAdapter {
    private Context mContext;
    private ArrayList<Image> mImage;

    public Adapter_ListView_Following(Context context, ArrayList<Image> images) {
        mContext = context;
        mImage = images;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mImage.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mImage.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    private static class ViewHolder {
        ImageView avatar;
        TextView name;
        TextView time;
        ImageView icon;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.custom_listview_following, parent, false);
            holder = new ViewHolder();

            holder.avatar = (ImageView) convertView.findViewById(R.id.imageView_follow);
            holder.name = (TextView) convertView.findViewById(R.id.tvName);
            holder.time = (TextView) convertView.findViewById(R.id.tvTime);
            holder.icon = (ImageView) convertView.findViewById(R.id.imageContact);



            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Image sg1 = (Image) getItem(position);
        holder.avatar.setImageBitmap(sg1.getAvatar());
        holder.name.setText(sg1.getName());
        holder.time.setText(sg1.getTime());
        holder.icon.setImageBitmap(sg1.getIcon());



        return convertView;
    }
}

