package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tvName, tvDetail;
    ImageView ivPhoto, ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName = findViewById(R.id.tv_name);
        tvDetail = findViewById(R.id.tv_detail);
        ivPhoto = findViewById(R.id.iv_photo);
        ivBack = findViewById(R.id.iv_back);

        tvName.setText(getIntent().getStringExtra("name"));
        tvDetail.setText(getIntent().getStringExtra("detail"));

        Glide.with(getApplicationContext())
                .load(getIntent().getStringExtra("photo"))
                .into(ivPhoto);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Fungsi penempatan finish() disini agar ketika kita tidak kembali ke laman DetailActivity setelah pindah ke MainActivity
            }
        });
    }
}
