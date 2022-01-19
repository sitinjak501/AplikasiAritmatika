package com.example.aplikasiaritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import BDeretAritmatika.Deret_Aritmatika;
import BarisanAritmatika.Barisan_Aritmatika;
import CBarisanGeometri.Barisan_Geometri;
import CDeretGeometri.Deret_Geometri;
import CeQuiz.Quiz_Aritmatika;

public class MainActivity extends AppCompatActivity {

    ImageView barisaritmatika, deretaritmatika, quizaritmatika, BarisanGeometri, DeretGeometri, TentangApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barisaritmatika = (ImageView)findViewById(R.id.barisanaritmatika);
        deretaritmatika = (ImageView)findViewById(R.id.deretaritmatika);
        quizaritmatika = (ImageView)findViewById(R.id.quiz);
        BarisanGeometri = findViewById(R.id.barisangeometri);
        DeretGeometri = findViewById(R.id.deretgeometri);
        TentangApp = findViewById(R.id.tentangaplikasi);

        //MENU
        barisaritmatika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Barisan_Aritmatika.class));
            }
        });
        deretaritmatika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Deret_Aritmatika.class));
            }
        });
        quizaritmatika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Quiz_Aritmatika.class));
            }
        });
        BarisanGeometri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Barisan_Geometri.class));
            }
        });
        DeretGeometri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Deret_Geometri.class));
            }
        });
        TentangApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Tentang_Aplikasi.class));
            }
        });
    }
}