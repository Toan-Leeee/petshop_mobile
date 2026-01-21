package com.example.petshop.data;

public class SanPham {
    private String ma;
    private String ten;
    private String gioiTinh;
    private String tuoi;
    private long gia;
    private int hinhAnh;

    public SanPham(String ma, String ten, String gioiTinh, String tuoi, long gia, int hinhAnh) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.gia = gia;
        this.hinhAnh = hinhAnh;
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

    public long getGia() {
        return gia;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }
}
