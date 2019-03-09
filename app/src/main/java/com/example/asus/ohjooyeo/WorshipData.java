package com.example.asus.ohjooyeo;

public class WorshipData {

    private  String title;
    private  String text22;
    private  String text33;

    public WorshipData() {
    }

    public WorshipData(String title, String text22, String text33) {
        this.title = title;
        this.text22 = text22;
        this.text33 = text33;
    }

    public String getTitle() { return title; }

    public String getText22() {
        return text22;
    }

    public String getText33() {
        return text33;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText22(String text22) {
        this.text22 = text22;
    }

    public void setText33(String text33) {
        this.text33 = text33;
    }
}
