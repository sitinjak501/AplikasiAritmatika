package BarisanAritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.aplikasiaritmatika.R;

public class Latiihansoal_Baris extends AppCompatActivity {



    Button BtnCekHasilBaris;
    EditText Txt_InputA,Txt_InputB,Txt_InputC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latiihansoal_baris);

        Txt_InputA=findViewById(R.id.et_nilaia);
        Txt_InputB=findViewById(R.id.et_nilaibanyak);
        Txt_InputC=findViewById(R.id.et_nilaibeda);
        BtnCekHasilBaris=findViewById(R.id.btn_hasilun);

        BtnCekHasilBaris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               int value_nilaia= Integer.parseInt(Txt_InputA.getText().toString());
               int value_nilaib= Integer.parseInt(Txt_InputB.getText().toString());
               int value_nilaic = Integer.parseInt(Txt_InputC.getText().toString());



                Intent kirim = new Intent(Latiihansoal_Baris.this, Jawaban_Baris_Aritmatika.class);
                kirim.putExtra("value_a", value_nilaia);
                kirim.putExtra("value_banyak", value_nilaib);
                kirim.putExtra("value_beda", value_nilaic);
                startActivity(kirim);
            }
        });

    }

    public void kembali3(View view) {
        onBackPressed();
    }
}




