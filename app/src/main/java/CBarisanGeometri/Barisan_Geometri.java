package CBarisanGeometri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.aplikasiaritmatika.R;

public class Barisan_Geometri extends AppCompatActivity {

    ImageView LatihanSoal, ContohSoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barisan_geometri);

        LatihanSoal = findViewById(R.id.latihansoalBG);
        ContohSoal = findViewById(R.id.contohsoalBG);

        LatihanSoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Barisan_Geometri.this, LatihanSoal_BarisanGeometri.class));
            }
        });

        ContohSoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Barisan_Geometri.this, ContohSoal_BarisanGeometri.class));
            }
        });
    }

    public void kembali9(View view) {
        onBackPressed();
    }
}