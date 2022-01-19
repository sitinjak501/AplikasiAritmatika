package BarisanAritmatika;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aplikasiaritmatika.R;

public class Jawaban_Baris_Aritmatika extends AppCompatActivity {


    TextView tv_nilaia,tv_nilaia2, tv_nilaia3,  tv_nilaibeda, tv_nilaibanyak, tv_nilaiUN, tv_nilaikurung,
            tv_nilaikali, tv_nilaitambah, tv_nilaib2 ,tv_nilaiTotal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jawaban_penjelasan);

        tv_nilaia=findViewById(R.id.mTxt_Nilaiaa);
        tv_nilaia2=findViewById(R.id.mTxt_Nilaiaa2);
        tv_nilaia3=findViewById(R.id.mTxt_Nilaiaa3);

        tv_nilaikurung=findViewById(R.id.tv_hasilkurung);
        tv_nilaikali=findViewById(R.id.tv_hasilkali);
        tv_nilaitambah= findViewById(R.id.tv_hasiltambah);
        tv_nilaiTotal=findViewById(R.id.tv_hasilakhir);

        tv_nilaibanyak= findViewById(R.id.mTxt_Nilain);
        tv_nilaibeda = findViewById(R.id.mTxt_Nilaibb);
        tv_nilaib2 = findViewById(R.id.mTxt_Nilaibb2);
        tv_nilaiUN=findViewById(R.id.mTxt_NilaiUn);


        Intent terima = getIntent();
        int sukupertama = terima.getExtras().getInt("value_a");
        int banyaksuku = terima.getExtras().getInt("value_banyak");
        int beda = terima.getExtras().getInt("value_beda");



        tv_nilaia.setText(String.valueOf(sukupertama));
        tv_nilaia2.setText(String.valueOf(sukupertama));
        tv_nilaia3.setText(String.valueOf(sukupertama));
        tv_nilaibanyak.setText(String.valueOf(banyaksuku));
        tv_nilaibeda.setText(String.valueOf(beda));
        tv_nilaib2.setText(String.valueOf(beda));


        int hasilkurung = banyaksuku -1;
        int hasilkali = hasilkurung * beda;
        int hasiltambah = sukupertama + hasilkali;

        tv_nilaikurung.setText(String.valueOf(hasilkurung));
        tv_nilaikali.setText(String.valueOf(hasilkali));
        tv_nilaitambah.setText(String.valueOf(hasiltambah));
        tv_nilaiTotal.setText(String.valueOf(hasiltambah));


    }

    public void kembali4(View view) {
        onBackPressed();
    }
}
