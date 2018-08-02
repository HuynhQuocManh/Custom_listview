package com.huynhquocmanh.listview_nang_cao_truyen_tranh;

public class Truyen_tranh {
    String tentruyen;
    int id;
    int sotrang;
    int hinhanh;
    int giaban;

    public Truyen_tranh(String tentruyen, int id, int sotrang, int hinhanh, int giaban) {
        this.tentruyen = tentruyen;
        this.id = id;
        this.sotrang = sotrang;
        this.hinhanh = hinhanh;
        this.giaban = giaban;
    }

    public String getTentruyen() {
        return tentruyen;
    }

    public void setTentruyen(String tentruyen) {
        this.tentruyen = tentruyen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }


}