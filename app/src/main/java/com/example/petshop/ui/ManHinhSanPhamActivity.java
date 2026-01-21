package com.example.petshop.ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.petshop.R;
import com.example.petshop.data.DuLieuMau;
import com.example.petshop.data.SanPham;
import com.example.petshop.util.adapter.SanPhamAdapter;

import java.util.List;

public class ManHinhSanPhamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man_hinh_san_pham);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView rvSanPham = findViewById(R.id.rvSanPham);
        rvSanPham.setLayoutManager(new GridLayoutManager(this, 2)); // 2 sản phẩm / hàng

        List<SanPham> ds = DuLieuMau.layDanhSachSanPham();

        SanPhamAdapter adapter = new SanPhamAdapter(ds, item -> {
            // TODO mở màn hình chi tiết nếu muốn
        });

        rvSanPham.setAdapter(adapter);
    }
}
