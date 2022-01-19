package CDeretGeometri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.aplikasiaritmatika.R;

public class JawabanDeret_Geometri extends AppCompatActivity {

    TextView JW_nilaiA, JW_nilaiN, JW_nilaiR, cetakSemua, TurunanPengurangan_tv, CetakBagiBawah, TV_NilaiAkhirDeretGeo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jawaban_deret_geometri);

        JW_nilaiA=findViewById(R.id.Jw_NilaiA);
        JW_nilaiN=findViewById(R.id.Jw_NilaiN);
        JW_nilaiR=findViewById(R.id.Jw_NilaiR);
        cetakSemua=findViewById(R.id.cetaksemua_deret);
        CetakBagiBawah=findViewById(R.id.tv_bagibawahderet);
        TurunanPengurangan_tv= findViewById(R.id.tv_turunanPengurangan);
        TV_NilaiAkhirDeretGeo=findViewById(R.id.tv_NilaiAkhirDeretGeo);

        Intent terimaderet = getIntent();
        int Nilai_AderetA=terimaderet.getExtras().getInt("AderetA");
        int Nilai_NderetN=terimaderet.getExtras().getInt("NderetN");
        int Nilai_RderetR=terimaderet.getExtras().getInt("RderetR");

        int a, r, n, Sn, nkurang1, pangkat, nilaiatas, nilaibawah;
        a = Nilai_AderetA;
        r = Nilai_RderetR;
        n = Nilai_NderetN;
        nkurang1= Nilai_NderetN - 1;
        pangkat = (int) Math.pow(r, nkurang1);
        nilaiatas = a * (pangkat -1);
        nilaibawah= r-1;


        if ( r > 1) {
            JW_nilaiA.setText(String.valueOf(a + " x " + (pangkat - 1)));
            JW_nilaiN.setText(String.valueOf(r + " - 1 "));
            JW_nilaiR.setText(String.valueOf(nilaiatas));
            TurunanPengurangan_tv.setText(String.valueOf(nilaibawah));
            TV_NilaiAkhirDeretGeo.setText(String.valueOf(nilaiatas / nilaibawah));
            cetakSemua.setText(String.valueOf(a + " ( " + pangkat + " -1 )"));
            CetakBagiBawah.setText(String.valueOf(r + " -1 "));
        }else {
            JW_nilaiA.setText(String.valueOf(a + " x " + (pangkat - 1)));
            JW_nilaiN.setText(String.valueOf("1 - " + r));
            JW_nilaiR.setText(String.valueOf(nilaiatas));
            TurunanPengurangan_tv.setText(String.valueOf(nilaibawah));
            TV_NilaiAkhirDeretGeo.setText(String.valueOf(nilaiatas / nilaibawah));
            cetakSemua.setText(String.valueOf(a + "( 1 - " + pangkat + " )"));
            CetakBagiBawah.setText(String.valueOf( " 1 - " + r));

        }



    }

    public void kembali15(View view) {
        onBackPressed();
    }
}