package com.example.tai.istagram_project;

import android.graphics.Bitmap;

/**
 * Created by TAI on 07/07/2015.
 */
public class Image {
    private Bitmap avatar;
    private String name;
    private String time;
    private  Bitmap icon;

    public Image(Bitmap avatar, String name, String time, Bitmap icon) {
        this.avatar = avatar;
        this.name = name;
        this.time = time;
        this.icon = icon;
    }

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }

    public Bitmap getAvatar() {
        return avatar;
    }

    public void setAvatar(Bitmap avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
