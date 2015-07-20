package com.example.tai.istagram_project;

import android.graphics.Bitmap;

/**
 * Created by TAI on 08/07/2015.
 */
public class Home {
    private Bitmap avatar;
    private String name;
    private String time;
    private Bitmap pic;
    private Bitmap heart;
    private Bitmap comment;
    private Bitmap bacham;
    private Bitmap smallHeart;
    private String numLike;

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

    public Bitmap getPic() {
        return pic;
    }

    public void setPic(Bitmap pic) {
        this.pic = pic;
    }

    public Bitmap getHeart() {
        return heart;
    }

    public void setHeart(Bitmap heart) {
        this.heart = heart;
    }

    public Bitmap getComment() {
        return comment;
    }

    public void setComment(Bitmap comment) {
        this.comment = comment;
    }

    public Bitmap getBacham() {
        return bacham;
    }

    public void setBacham(Bitmap bacham) {
        this.bacham = bacham;
    }

    public Bitmap getSmallHeart() {
        return smallHeart;
    }

    public void setSmallHeart(Bitmap smallHeart) {
        this.smallHeart = smallHeart;
    }

    public String getNumLike() {
        return numLike;
    }

    public void setNumLike(String numLike) {
        this.numLike = numLike;
    }

    public Home(Bitmap avatar, String name, String time, Bitmap pic, Bitmap heart, Bitmap comment, Bitmap bacham, Bitmap smallHeart, String numLike) {
        this.avatar = avatar;
        this.name = name;
        this.time = time;
        this.pic = pic;
        this.heart = heart;
        this.comment = comment;
        this.bacham = bacham;
        this.smallHeart = smallHeart;
        this.numLike = numLike;
    }
}