package CDeretGeometri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.aplikasiaritmatika.R;

public class ContohSoal_DeretGeometri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contoh_soal_deret_geometri);
    }

    public void kembali13(View view) {
        onBackPressed();
    }
}