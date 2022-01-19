package CBarisanGeometri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.aplikasiaritmatika.R;

public class ContohSoal_BarisanGeometri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contoh_soal_barisan_geometri);
    }

    public void kembali12(View view) {
        onBackPressed();
    }
}