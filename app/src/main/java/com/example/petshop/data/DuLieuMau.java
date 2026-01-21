package com.example.petshop.data;

import com.example.petshop.R;

import java.util.ArrayList;
import java.util.List;

public class DuLieuMau {

    public static List<SanPham> layDanhSachSanPham() {
        List<SanPham> ds = new ArrayList<>();

        ds.add(new SanPham("MO231", "Pomeranian Trắng", "Đực", "02 tháng", 6900000, R.drawable.dog));
        ds.add(new SanPham("MO502", "Poodle Tiny Vàng", "Cái", "02 tháng", 3900000, R.drawable.dog));
        ds.add(new SanPham("MO102", "Poodle Tiny Sepia", "Đực", "02 tháng", 4000000, R.drawable.dog));
        ds.add(new SanPham("MO512", "Alaskan Malamute", "Đực", "03 tháng", 8900000, R.drawable.dog));
        ds.add(new SanPham("MO777", "Corgi Vàng Trắng", "Cái", "02 tháng", 7200000, R.drawable.dog));
        ds.add(new SanPham("MO888", "Husky Xám Trắng", "Đực", "03 tháng", 8500000, R.drawable.dog));

        return ds;
    }

    public static List<TaiKhoan> layDanhSachTaiKhoan() {
        List<TaiKhoan> ds = new ArrayList<>();

        ds.add(new TaiKhoan("admin", "123456", "Admin"));
        ds.add(new TaiKhoan("user1", "123456", "Nguyễn Văn A"));
        ds.add(new TaiKhoan("user2", "123456", "Trần Thị B"));

        return ds;
    }

    public static List<ThuCung> layDanhSachThuCung() {
        List<ThuCung> ds = new ArrayList<>();
        ds.add(new ThuCung("TC01", "Chó Pomeranian", "Đực", "02 tháng"));
        ds.add(new ThuCung("TC02", "Chó Poodle", "Cái", "03 tháng"));
        ds.add(new ThuCung("TC03", "Chó Husky", "Đực", "04 tháng"));
        return ds;
    }

    public static List<DonHang> layDanhSachDonHang() {
        List<DonHang> ds = new ArrayList<>();
        ds.add(new DonHang("DH01", "user1", 6900000, "Đang xử lý"));
        ds.add(new DonHang("DH02", "user2", 8500000, "Hoàn thành"));
        return ds;
    }
}
