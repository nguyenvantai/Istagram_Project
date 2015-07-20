package com.example.tai.istagram_project;

import android.graphics.Bitmap;

/**
 * Created by TAI on 13/07/2015.
 */
public class Suggestion {
    private Bitmap icon;
    private String name;
    private String address;
    private Bitmap imageFollow;
    private Bitmap imgBacham;

    public Bitmap getImgAvatar() {
        return imgAvatar;
    }

    public void setImgAvatar(Bitmap imgAvatar) {
        this.imgAvatar = imgAvatar;
    }

    public Suggestion(Bitmap icon, String name, String address, Bitmap imageFollow, Bitmap imgBacham, Bitmap imgAvatar) {
        this.icon = icon;
        this.name = name;

        this.address = address;
        this.imageFollow = imageFollow;
        this.imgBacham = imgBacham;
        this.imgAvatar = imgAvatar;
    }

    private Bitmap imgAvatar;

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Bitmap getImageFollow() {
        return imageFollow;
    }

    public void setImageFollow(Bitmap imageFollow) {
        this.imageFollow = imageFollow;
    }

    public Bitmap getImgBacham() {
        return imgBacham;
    }

    public void setImgBacham(Bitmap imgBacham) {
        this.imgBacham = imgBacham;
    }

}
