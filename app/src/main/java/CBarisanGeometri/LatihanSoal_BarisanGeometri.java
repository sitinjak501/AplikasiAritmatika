package CBarisanGeometri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aplikasiaritmatika.R;

public class LatihanSoal_BarisanGeometri extends AppCompatActivity {

    EditText BarisGeo_A, BarisGeo_N, BarisGeo_R;
    Button HasilBaris_Geo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan_soal_barisan_geometri);

        BarisGeo_A=findViewById(R.id.Abaris_geo);
        BarisGeo_N=findViewById(R.id.Nbaris_geo);
        BarisGeo_R=findViewById(R.id.Rbaris_geo);
        HasilBaris_Geo=findViewById(R.id.cekhasil_barisgeo);

        HasilBaris_Geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Value_ABG=Integer.parseInt(BarisGeo_A.getText().toString());
                int Value_NBG=Integer.parseInt(BarisGeo_N.getText().toString());
                int Value_RBG=Integer.parseInt(BarisGeo_R.getText().toString());

                Intent HasilGeo=new Intent(LatihanSoal_BarisanGeometri.this, JawabanBarisan_Geometri.class);
                HasilGeo.putExtra("AbarisgeoA", Value_ABG);
                HasilGeo.putExtra("NbarisgeoN", Value_NBG);
                HasilGeo.putExtra("RbarisgeoR", Value_RBG);
                startActivity(HasilGeo);
            }
        });



    }

    public void kembali10(View view) {
        onBackPressed();
    }
}