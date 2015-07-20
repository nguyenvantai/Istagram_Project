package com.example.tai.istagram_project;


import android.graphics.Bitmap;

/**
 * Created by TAI on 06/07/2015.
 */
public class You {
    private Bitmap avatar;
    private String notify;
    private Bitmap following;



    public You(Bitmap avatar, String notify,Bitmap following) {
        this.avatar = avatar;

        this.notify = notify;
        this.following=following;

    }
    public Bitmap getFollowing() {
        return following;
    }

    public void setFollowing(Bitmap following) {
        this.following = following;
    }

    public Bitmap getAvatar() {
        return avatar;
    }

    public void setAvatar(Bitmap avatar) {
        this.avatar = avatar;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    private int image;

}
