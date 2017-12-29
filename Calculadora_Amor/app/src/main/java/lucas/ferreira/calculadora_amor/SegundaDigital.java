package lucas.ferreira.calculadora_amor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class SegundaDigital extends AppCompatActivity{

    private ImageButton btnLeitor2;
    private int porcentagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_digital);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        btnLeitor2 = findViewById(R.id.sd_btn_leitor);

        btnLeitor2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Random r = new Random();
                porcentagem = r.nextInt(100);
                telaCalBio(v);
                return false;
            }
        });
    }//Fecha onCreate

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, PrimeiraDigital.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }

    public void telaCalBio(View view){
        Intent intent = new Intent(this,CalcularDigital.class);
        startActivity(intent);
        finish();
    }

}//Fecha Classe
