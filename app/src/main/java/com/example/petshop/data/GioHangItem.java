package com.example.petshop.data;

public class GioHangItem {

    private SanPham sanPham;
    private int soLuong;

    public GioHangItem(SanPham sanPham, int soLuong) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    // ✅ DÙNG long – KHÔNG FORMAT
    public long tinhThanhTien() {
        return sanPham.getGia() * soLuong;
    }
}
