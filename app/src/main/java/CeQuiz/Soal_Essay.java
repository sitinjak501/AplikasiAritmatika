package CeQuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aplikasiaritmatika.R;

public class Soal_Essay extends AppCompatActivity {

    EditText et_jawab1, et_jawab2, et_jawab3, et_jawab4, et_jawab5;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soal_essay);

        et_jawab1=findViewById(R.id.txt_jawab1);
        et_jawab2=findViewById(R.id.txt_jawab2);
        et_jawab3=findViewById(R.id.txt_jawab3);
        et_jawab4=findViewById(R.id.txt_jawab4);
        et_jawab5=findViewById(R.id.txt_jawab5);
        btnsubmit=findViewById(R.id.button_prosesE);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilai = 0;

                if (et_jawab1.getText().toString().toLowerCase().equals("babi")){
                    nilai = nilai + 20;
                }
                if (et_jawab2.getText().toString().toLowerCase().equals("775")){
                    nilai = nilai + 20;
                }
                if (et_jawab3.getText().toString().toLowerCase().equals("39")){
                    nilai = nilai + 20;
                }
                if (et_jawab4.getText().toString().toLowerCase().equals("31")){
                    nilai = nilai + 20;
                }
                if (et_jawab5.getText().toString().toLowerCase().equals("1024")){
                    nilai = nilai + 20;
                }
                Intent i =new Intent(Soal_Essay.this, Hasil_Kuis.class);
                i.putExtra("nilai", nilai);
                startActivity(i);
                finish();
            }
        });
    }
}