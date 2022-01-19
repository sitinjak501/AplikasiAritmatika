package BDeretAritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.aplikasiaritmatika.R;

public class Contohsoal_Deret extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contohsoal_deret);
    }

    public void kembali5(View view) {
        onBackPressed();
    }
}