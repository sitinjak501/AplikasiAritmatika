package CDeretGeometri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aplikasiaritmatika.R;

public class LatihanSoal_DeretGeometri extends AppCompatActivity {

    EditText Et_NilaiDeretA, Et_NilaiDeretN, Et_NilaiDeretR;
    Button Btn_HasilDeret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan_soal_deret_geometri);

        Et_NilaiDeretA=findViewById(R.id.et_nilaiAderet);
        Et_NilaiDeretN=findViewById(R.id.et_nilaiNderet);
        Et_NilaiDeretR=findViewById(R.id.et_nilaiRderet);
        Btn_HasilDeret=findViewById(R.id.btn_hasilSnDer);

        Btn_HasilDeret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int Value_DeretA = Integer.parseInt(Et_NilaiDeretA.getText().toString());
                int Value_DeretN = Integer.parseInt(Et_NilaiDeretN.getText().toString());
                int Value_DeretR = Integer.parseInt(Et_NilaiDeretR.getText().toString());

                Intent intent=new Intent(LatihanSoal_DeretGeometri.this, JawabanDeret_Geometri.class);
                intent.putExtra("AderetA", Value_DeretA);
                intent.putExtra("NderetN", Value_DeretN);
                intent.putExtra("RderetR", Value_DeretR);
                startActivity(intent);
            }
        });
    }

    public void kembali16(View view) {
        onBackPressed();
    }
}