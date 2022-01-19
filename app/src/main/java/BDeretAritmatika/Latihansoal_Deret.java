package BDeretAritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aplikasiaritmatika.R;

public class Latihansoal_Deret extends AppCompatActivity {

    EditText Val_sukupertama, Val_barisanpertama, txt_bedaderet, txt_banyaksuku;
    Button btn_hasilderet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihansoal_deret);


        Val_barisanpertama=findViewById(R.id.et_berisanpertamatxt);
        txt_bedaderet=findViewById(R.id.et_beda);
        txt_banyaksuku=findViewById(R.id.et_banyaksuku);
        btn_hasilderet = (Button)findViewById(R.id.hasilderet_btn);

        btn_hasilderet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int k_pertamabarisan=Integer.parseInt(Val_barisanpertama.getText().toString());
                int k_deretbeda=Integer.parseInt(txt_bedaderet.getText().toString());
                int k_sukubanyak=Integer.parseInt(txt_banyaksuku.getText().toString());

                Intent send1 =new Intent(Latihansoal_Deret.this, JawabanPenjelasan_Deret.class);
                send1.putExtra("barisanpertama2", k_pertamabarisan);
                send1.putExtra("bedaderet2", k_deretbeda);
                send1.putExtra("banyaksuku2", k_sukubanyak);
                startActivity(send1);
            }
        });


    }

    public void kembali8(View view) {
        onBackPressed();
    }
}