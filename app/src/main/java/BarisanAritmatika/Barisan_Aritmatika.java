package BarisanAritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.aplikasiaritmatika.MainActivity;
import com.example.aplikasiaritmatika.R;


public class Barisan_Aritmatika extends AppCompatActivity {

    ImageView imagecontohsoal, imagelatihansoal, backnav;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barisan_aritmatika);

        imagecontohsoal = (ImageView)findViewById(R.id.contohsoalimg);
        imagelatihansoal = (ImageView)findViewById(R.id.latihansoalimg);
        backnav = (ImageView)findViewById(R.id.kembalibaris);





        imagelatihansoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Barisan_Aritmatika.this, Latiihansoal_Baris.class));
            }
        });
        imagecontohsoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Barisan_Aritmatika.this, Contohsoal_Baris.class));
            }
        });


    }

    public void kembali1(View view) {
        onBackPressed();
    }
}