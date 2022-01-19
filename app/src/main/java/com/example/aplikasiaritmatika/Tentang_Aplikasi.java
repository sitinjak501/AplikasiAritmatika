package com.example.aplikasiaritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Tentang_Aplikasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang_aplikasi);
    }

    public void kembali18(View view) {
        onBackPressed();
    }
}