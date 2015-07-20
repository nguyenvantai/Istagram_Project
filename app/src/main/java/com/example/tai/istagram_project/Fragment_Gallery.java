package com.example.tai.istagram_project;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by TAI on 14/07/2015.
 */


public class Fragment_Gallery extends Fragment {

    private ArrayList<File> fileList = new ArrayList<File>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gallery, container, false);
        // get image from sd card
//        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/MyInstagram";
//        File dir = new File(path);
//        File[] listFile = dir.listFiles();

        //File f = new File("/MyInstagram");

       // GridView gridview = (GridView) v.findViewByInjymjefymydf mgued(R.id.gridview);
       // gridview.setAdapter(new ImageAdapter(v.getContext()));

//        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            public void onItemClick(AdapterView<?> parent, View v,
//                                    int position, long id) {
//
//            }
//        });
//
        File f  = new File("/sdcard/JCG Camera/tai.jpg");
        //File f = new File("/sdcard/JCG Camera");
         ImageView imageView = (ImageView) v.findViewById(R.id.imgView);
        //        File[] listFile = dir.listFiles();
          Bitmap bmp = BitmapFactory.decodeFile(f.getAbsolutePath());
          imageView.setImageBitmap(bmp);
        //imageView.setImageBitmap(BitmapFactory.decodeFile(listFile[0].getAbsolutePath()));
        return v;
    }

//    public ArrayList<File> getfile(File dir) {
//        File listFile[] = dir.listFiles();
//        if (listFile != null && listFile.length > 0) {
//            for (int i = 0; i < listFile.length; i++) {
//
//                if (listFile[i].isDirectory()) {
//                    fileList.add(listFile[i]);
//                    getfile(listFile[i]);
//
//                } else {
//                    if (listFile[i].getName().endsWith(".png")
//                            || listFile[i].getName().endsWith(".jpg")
//                            || listFile[i].getName().endsWith(".jpeg")
//                            || listFile[i].getName().endsWith(".gif"))
//
//                    {
//                        fileList.add(listFile[i]);
//                    }
//                }
//
//            }
//        }
//        return fileList;
//    }

}


