package com.example.aplikasiaritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import CeQuiz.Hasil_Kuis;
import CeQuiz.Quiz_Aritmatika;

public class Hasil_Kuis_PG extends AppCompatActivity {

    TextView txt_pointskor, txt_comment;
    Button cobalagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_kuis_pg);
        txt_pointskor=findViewById(R.id.txt_pointskor);
        txt_comment=findViewById(R.id.txt_comment);
        cobalagi=findViewById(R.id.btn_ulangilagi);

//        int nilai = getIntent().getExtras().getInt("nilai");
        int skore = getIntent().getExtras().getInt("scorePG");

        txt_pointskor.setText(String.valueOf(skore));

        if (skore >= 80 ){
            txt_comment.setText("Selamat, Anda Lulus");
        }else {
            txt_comment.setText("Kamu Harus Belajar Lagi");
        }

        cobalagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hasil_Kuis_PG.this, Quiz_Aritmatika.class);
                startActivity(i);
                finish();
            }
        });
    }
}