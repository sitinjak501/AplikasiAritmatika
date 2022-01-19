package CeQuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aplikasiaritmatika.R;

public class Hasil_Kuis extends AppCompatActivity {

    TextView txt_pointskor, txt_comment;
    Button cobalagi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_kuis);

        txt_pointskor=findViewById(R.id.txt_pointskor);
        txt_comment=findViewById(R.id.txt_comment);
        cobalagi=findViewById(R.id.btn_ulangilagi);

        int nilai = getIntent().getExtras().getInt("nilai");
        int skore = getIntent().getExtras().getInt("scorePG");
        txt_pointskor.setText(String.valueOf(nilai));
//        txt_pointskor.setText(String.valueOf(skore));

        if (nilai >= 80 ){
            txt_comment.setText("Selamat, Anda Lulus");
        }else {
            txt_comment.setText("Kamu Harus Belajar Lagi");
        }

        cobalagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Hasil_Kuis.this, Quiz_Aritmatika.class);
                startActivity(i);
                finish();
            }
        });

    }
}