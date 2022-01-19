package CBarisanGeometri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.aplikasiaritmatika.R;

public class JawabanBarisan_Geometri extends AppCompatActivity {

    TextView A_BarisGeoA, N_BarisGeo, R_BarisGeo, Pangkat_et, turunan_NilaiA, turunan_nilaiA2, nilaiNdikurang
    ,hasil_pangkat, Total_nilaiUn, JadiHasilUn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jawaban_barisan_geometri);

        A_BarisGeoA=findViewById(R.id.et_barisGeoA);
        N_BarisGeo=findViewById(R.id.et_barisGN);
        R_BarisGeo=findViewById(R.id.et_barisGR);

        Pangkat_et=findViewById(R.id.et_pangkat);
        turunan_NilaiA=findViewById(R.id.AturunanbarGeoA);
        turunan_nilaiA2=findViewById(R.id.TurunanNilaiA2);
        nilaiNdikurang=findViewById(R.id.et_nilaiNkurang1);
        hasil_pangkat=findViewById(R.id.et_turunanpangkat);
        Total_nilaiUn=findViewById(R.id.et_totalbarisgeo);
        JadiHasilUn=findViewById(R.id.jadihasildari);


        Intent TerimaHasil = getIntent();
        int A_BarisGeo_A=TerimaHasil.getExtras().getInt("AbarisgeoA");
        int N_BarisGeo_N=TerimaHasil.getExtras().getInt("NbarisgeoN");
        int R_BarisGeo_R=TerimaHasil.getExtras().getInt("RbarisgeoR");

        int pangkatkurang1= N_BarisGeo_N-1;
        int pangkat = (int)Math.pow(R_BarisGeo_R, pangkatkurang1);
        int perkalian= A_BarisGeo_A * pangkat;


        A_BarisGeoA.setText(String.valueOf(A_BarisGeo_A));
        N_BarisGeo.setText(String.valueOf(N_BarisGeo_N));
        R_BarisGeo.setText(String.valueOf(R_BarisGeo_R));

        turunan_NilaiA.setText(String.valueOf(A_BarisGeo_A));
        turunan_nilaiA2.setText(String.valueOf(A_BarisGeo_A));
        nilaiNdikurang.setText(String.valueOf(pangkatkurang1));
        hasil_pangkat.setText(String.valueOf(pangkat));
        Total_nilaiUn.setText(String.valueOf(perkalian));
        Pangkat_et.setText(String.valueOf(R_BarisGeo_R));
        JadiHasilUn.setText(String.valueOf(perkalian));


    }

    public void kembali11(View view) {
        onBackPressed();
    }
}