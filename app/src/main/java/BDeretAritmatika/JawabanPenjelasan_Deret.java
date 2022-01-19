package BDeretAritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.aplikasiaritmatika.R;

public class JawabanPenjelasan_Deret extends AppCompatActivity {

    TextView Tv_sukupertamatxt, Tv_barisanpertamatxt, Tv_bedaderet, Tv_banyaksuku, tv_hasilbagi2, tv_hasilkali2
            , tv_hasilkurang1, tv_turunanb, tv_turunanhasilbagi, tv_hasilsemuakurung, tv_hasilseluruh, tv_cetak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jawaban_penjelasan_deret);

        Tv_sukupertamatxt=findViewById(R.id.tv_sukuawal);
        Tv_barisanpertamatxt=findViewById(R.id.mario);
        Tv_bedaderet=findViewById(R.id.pace);
        Tv_banyaksuku=findViewById(R.id.tv_banyaksuku);
        tv_cetak=findViewById(R.id.tv_cetaktotal);

        tv_hasilbagi2=findViewById(R.id.hasilbagi_bg);
        tv_hasilkali2=findViewById(R.id.hasilkali2);
        tv_hasilkurang1=findViewById(R.id.hasilkurang1);
        tv_turunanb=findViewById(R.id.turunan_b);
        tv_turunanhasilbagi=findViewById(R.id.turunanhasilbagi);
        tv_hasilsemuakurung=findViewById(R.id.hasilsemuakurung);
        tv_hasilseluruh=findViewById(R.id.hasilSn);

        Intent acc1 = getIntent();
        int barisanpertama_k = acc1.getExtras().getInt("barisanpertama2");
        int bedaderetan_k = acc1.getExtras().getInt("bedaderet2");
        int banyaksuku_k = acc1.getExtras().getInt("banyaksuku2");

        int bagi2 = banyaksuku_k / 2;
        int kali2 = 2 * barisanpertama_k;
        int kurang1 = banyaksuku_k - 1;
        int hasilkurung = kurang1 * bedaderetan_k;
        int hasilsemuakurung= kali2 + hasilkurung;
        int total = bagi2 * hasilsemuakurung;


        Tv_sukupertamatxt.setText(String.valueOf(barisanpertama_k));
        Tv_bedaderet.setText(String.valueOf(bedaderetan_k));
        Tv_banyaksuku.setText(String.valueOf(banyaksuku_k));
        Tv_barisanpertamatxt.setText(String.valueOf(banyaksuku_k));

        tv_hasilkali2.setText(String.valueOf(kali2));
        tv_hasilkurang1.setText(String.valueOf(kurang1));
        tv_turunanb.setText(String.valueOf(bedaderetan_k));
        tv_hasilbagi2.setText(String.valueOf(bagi2));
        tv_turunanhasilbagi.setText(String.valueOf(bagi2));
        tv_hasilsemuakurung.setText(String.valueOf(hasilsemuakurung));
        tv_hasilseluruh.setText(String.valueOf(total));
        tv_cetak.setText(String.valueOf(total));




    }

    public void kembali7(View view) {
        onBackPressed();
    }
}