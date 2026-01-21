package com.example.petshop.data;

public class TaiKhoan {
    private String tenDangNhap;
    private String matKhau;
    private String hoTen;

    public TaiKhoan(String tenDangNhap, String matKhau, String hoTen) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }
}
