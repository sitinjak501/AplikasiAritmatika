package CDeretGeometri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.aplikasiaritmatika.R;

public class Deret_Geometri extends AppCompatActivity {

    ImageView LatihanSoal_Deret, ContohSoal_Deret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deret_geometri);

        LatihanSoal_Deret=findViewById(R.id.latihansoalDG);
        ContohSoal_Deret=findViewById(R.id.contohsoalDG);

        LatihanSoal_Deret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Deret_Geometri.this, LatihanSoal_DeretGeometri.class));
            }
        });
        ContohSoal_Deret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Deret_Geometri.this, ContohSoal_DeretGeometri.class));
            }
        });
    }

    public void kembali14(View view) {
        onBackPressed();
    }
}