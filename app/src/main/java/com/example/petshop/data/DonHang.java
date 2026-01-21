package com.example.petshop.data;

public class DonHang {
    private String maDon;
    private String tenDangNhap;
    private long tongTien;
    private String trangThai;

    public DonHang(String maDon, String tenDangNhap, long tongTien, String trangThai) {
        this.maDon = maDon;
        this.tenDangNhap = tenDangNhap;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public String getMaDon() {
        return maDon;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public long getTongTien() {
        return tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }
}
