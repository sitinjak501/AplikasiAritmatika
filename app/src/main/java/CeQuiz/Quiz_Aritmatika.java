package CeQuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aplikasiaritmatika.MainActivity;
import com.example.aplikasiaritmatika.R;

import CBarisanGeometri.Barisan_Geometri;

public class Quiz_Aritmatika extends AppCompatActivity {

    Button BtnPilihanGanda, BtnEssay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_aritmatika);

        BtnPilihanGanda = (Button) findViewById(R.id.btnpilihanganda);
        BtnEssay=(Button)findViewById(R.id.btnessay);

        BtnPilihanGanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quiz_Aritmatika.this, Pilihan_Ganda.class));
            }
        });
        BtnEssay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quiz_Aritmatika.this, Soal_Essay.class));
            }
        });
    }

    public void kembali17(View view) {
        onBackPressed();
    }
}