package BDeretAritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.aplikasiaritmatika.MainActivity;
import com.example.aplikasiaritmatika.R;

public class Deret_Aritmatika extends AppCompatActivity {

    ImageView Latihansoal, Contohsoal, BackNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deret_aritmatika);

        Latihansoal = (ImageView)findViewById(R.id.latihansoalimgsatu);
        Contohsoal = (ImageView)findViewById(R.id.contohsoalimgsatu);
        BackNav = (ImageView)findViewById(R.id.kembalibarisderet);

        Latihansoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Deret_Aritmatika.this, Latihansoal_Deret.class));
            }
        });
        Contohsoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Deret_Aritmatika.this, Contohsoal_Deret.class));
            }
        });

    }

    public void kembali6(View view) {
        onBackPressed();
    }
}