package com.example.petshop.data;

public class ThuCung {
    private String ma;
    private String ten;
    private String gioiTinh;
    private String tuoi;

    public ThuCung(String ma, String ten, String gioiTinh, String tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getTuoi() {
        return tuoi;
    }
}
