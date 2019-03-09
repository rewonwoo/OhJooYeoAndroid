package com.example.asus.ohjooyeo;

import android.widget.ImageView;
/// DTO
public class Recyclerview2 {

    private  String text1;
    private int image1;

    public Recyclerview2(String text1, int image1) {
        this.text1 = text1;
        this.image1 = image1;
    }

    public String getText1() { return text1; }

    public int getImage1() { return image1; }

    public void setText1(String text1) { this.text1 = text1; }

    public void setImage1(int image1) { this.image1 = image1; }
}
