package com.example.petshop.util;

import java.text.DecimalFormat;

public class TienIch {

    // Chỉ để HIỂN THỊ
    public static String dinhDangTien(int soTien) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(soTien) + " VND";
    }

    // Nếu muốn lưu SharePreferences dạng String thì dùng cái này
    public static String tienToString(int soTien) {
        return String.valueOf(soTien);
    }

    // Nếu đọc từ SharePreferences (String) về lại int để tính toán
    public static int stringToTien(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return 0;
        }
    }
}
