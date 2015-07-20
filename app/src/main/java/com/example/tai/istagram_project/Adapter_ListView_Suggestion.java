package com.example.tai.istagram_project;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter_ListView_Suggestion extends BaseAdapter {
    private Context mContext;
    private ArrayList<Suggestion> mSuggestion;

    public Adapter_ListView_Suggestion(Context context, ArrayList<Suggestion> suggestions) {
        mContext = context;
        mSuggestion = suggestions;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mSuggestion.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mSuggestion.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    private static class ViewHolder {
        ImageView icon;
        TextView name;
        TextView address;
        ImageView imageFollow;
        ImageView imgBacham;
        ImageView imgAvatar;




    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.custom_listview_people_suggestion, parent, false);
            holder = new ViewHolder();

            holder.icon = (ImageView) convertView.findViewById(R.id.iw2);
            holder.name = (TextView) convertView.findViewById(R.id.k1);
            holder.address = (TextView) convertView.findViewById(R.id.k2);
            holder.imageFollow = (ImageView) convertView.findViewById(R.id.iu);
            holder.imgBacham = (ImageView) convertView.findViewById(R.id.iu2);
            holder.imgAvatar = (ImageView) convertView.findViewById(R.id.iur);



            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Suggestion sg1 = (Suggestion) getItem(position);
        holder.icon.setImageBitmap(sg1.getIcon());
        holder.name.setText(sg1.getName());
        holder.address.setText(sg1.getAddress());
        holder.imageFollow.setImageBitmap(sg1.getImageFollow());
        holder.imgBacham.setImageBitmap(sg1.getImgBacham());
        holder.imgAvatar.setImageBitmap(sg1.getImgAvatar());



        return convertView;
    }
}

