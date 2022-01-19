package CeQuiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aplikasiaritmatika.Hasil_Kuis_PG;
import com.example.aplikasiaritmatika.R;

public class Pilihan_Ganda extends AppCompatActivity {

    private Library_Soal library_soal=new Library_Soal();
    Button BTN_optionsatu, BTN_optiondua, BTN_optiontiga, BTN_optionempat, BTN_optionlima;
    TextView TV_soalpilihan, TV_pointpilihanganda;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionnumb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihan_ganda);


//        TV_soalpilihan=(TextView)findViewById(R.id.soal_pilihanganda);
        BTN_optionsatu= (Button) findViewById(R.id.btn_optionsatu);
        BTN_optiondua= (Button) findViewById(R.id.btn_optiondua);
        BTN_optiontiga= (Button) findViewById(R.id.btn_optiontiga);
        BTN_optionempat= (Button) findViewById(R.id.btn_optionempat);
        BTN_optionlima= (Button) findViewById(R.id.btn_optionlima);
        TV_pointpilihanganda=(TextView) findViewById(R.id.btn_soalnext);

        updateQuestion();

        BTN_optionsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (BTN_optionsatu.getText() == mAnswer) {
                    mScore = mScore + 20;
//                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Pilihan_Ganda.this, "Jawaban Anda Benar", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Pilihan_Ganda.this, "Jawaban Anda Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        BTN_optiondua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (BTN_optiondua.getText() == mAnswer) {
                    mScore = mScore + 20;
//                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Pilihan_Ganda.this, "Jawaban Anda Benar", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Pilihan_Ganda.this, "Jawaban Anda Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        BTN_optiontiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (BTN_optiontiga.getText() == mAnswer) {
                    mScore = mScore + 20;
//                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Pilihan_Ganda.this, "Jawaban Anda Benar", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Pilihan_Ganda.this, "Jawaban Anda Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        BTN_optionempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (BTN_optionempat.getText() == mAnswer) {
                    mScore = mScore + 20;
//                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Pilihan_Ganda.this, "Jawaban Anda Benar", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Pilihan_Ganda.this, "Jawaban Anda Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        BTN_optionlima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (BTN_optionlima.getText() == mAnswer) {
                    mScore = mScore + 20;
//                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Pilihan_Ganda.this, "Jawaban Anda Benar", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Pilihan_Ganda.this, "Jawaban Anda Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });


    }

    private void updateQuestion() {
        if (mQuestionnumb < library_soal.getLength()) {
            TV_pointpilihanganda.setText(library_soal.getSoal(mQuestionnumb));
            BTN_optionsatu.setText(library_soal.getChoice1(mQuestionnumb));
            BTN_optiondua.setText(library_soal.getChoice2(mQuestionnumb));
            BTN_optiontiga.setText(library_soal.getChoice3(mQuestionnumb));
            BTN_optionempat.setText(library_soal.getChoice4(mQuestionnumb));
            BTN_optionlima.setText(library_soal.getChoice5(mQuestionnumb));

            mAnswer = library_soal.getJawabanBenar(mQuestionnumb);
            mQuestionnumb++;
        }else {
//            Toast.makeText(Pilihan_Ganda.this, "", Toast.LENGTH_SHORT).show();
            Intent kuisskor = new Intent(Pilihan_Ganda.this, Hasil_Kuis_PG.class);
            kuisskor.putExtra("scorePG", mScore);
            startActivity(kuisskor);
        }
    }



//    private void updateScore(int point){
//        TV_soalpilihan.setText(""+mScore);
//    }
}