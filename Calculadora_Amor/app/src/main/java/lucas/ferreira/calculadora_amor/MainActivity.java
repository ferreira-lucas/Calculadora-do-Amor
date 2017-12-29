package lucas.ferreira.calculadora_amor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNome;
    private Button btnBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNome = findViewById(R.id.ma_btn_nome);
        btnBio = findViewById(R.id.ma_btn_bio);

        btnNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaNome(v);
            }//Fecha OnClick
        });//btnNome OnClick
        btnBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                telaPriBio(v);
            }//Fecha OnClick
        });//btnPriBio OnClick

    }//Fecha onCreate

    public void telaNome(View view){
        Intent intent = new Intent(this, CalcularNome.class);
        startActivity(intent);
    }//Fecha telaNome

    public void telaPriBio(View view){
        Intent intent = new Intent(this,PrimeiraDigital.class);
        startActivity(intent);
    }//Fecha TelaPriBio

}//Fecha Classe
