package com.example.tai.istagram_project;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;




public class Adapter_ListView_Home extends BaseAdapter {
    private Context mContext;
    private ArrayList<Home> mHome;
    private TextView tvLike;

    public Adapter_ListView_Home(Context context, ArrayList<Home> home) {
        mContext = context;
        mHome = home;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mHome.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mHome.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    private static class ViewHolder {
        ImageView picture;
        TextView name;
        TextView time;
        ImageView pic;
        ImageView imgHeart;
        ImageView comment;
        ImageView bacham;
        ImageView smallHeart;
        TextView numberLike;



    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.custom_listview_home, parent, false);
            holder = new ViewHolder();

            holder.picture = (ImageView) convertView.findViewById(R.id.imgAvatar);
            holder.name = (TextView) convertView.findViewById(R.id.tvProfile);
            holder.time = (TextView) convertView.findViewById(R.id.time1);
            holder.pic = (ImageView) convertView.findViewById(R.id.i);
            holder.imgHeart = (ImageView) convertView.findViewById(R.id.imageHeart);
            final Drawable nDrawable = mContext.getResources().getDrawable(R.drawable.tim3);


            holder.comment = (ImageView) convertView.findViewById(R.id.imageComment);
            holder.bacham = (ImageView) convertView.findViewById(R.id.imageBacham);
            holder.smallHeart = (ImageView) convertView.findViewById(R.id.imagesmallHeart);
            holder.numberLike = (TextView) convertView.findViewById(R.id.text1);
//            final float like= Float.parseFloat((String) holder.numberLike.getText());
            holder.imgHeart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.imgHeart.setImageDrawable(nDrawable);
//                   Float number_like = like+1;
//                    holder.numberLike.setText(""+number_like);

                }
            });


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Home sg2 = (Home) getItem(position);
        holder.picture.setImageBitmap(sg2.getAvatar());
        holder.name.setText(sg2.getName());
        holder.time.setText(sg2.getTime());
        holder.pic.setImageBitmap(sg2.getPic());
        holder.imgHeart.setImageBitmap(sg2.getHeart());
        holder.comment.setImageBitmap(sg2.getComment());
        holder.bacham.setImageBitmap(sg2.getBacham());
        holder.smallHeart.setImageBitmap(sg2.getSmallHeart());
        holder.numberLike.setText(sg2.getNumLike());






        return convertView;
    }

}

