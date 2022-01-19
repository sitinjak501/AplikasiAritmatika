package BarisanAritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.aplikasiaritmatika.R;

public class Contohsoal_Baris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contohsoal_baris);
    }

    public void kembali2(View view) {
        onBackPressed();
    }
}