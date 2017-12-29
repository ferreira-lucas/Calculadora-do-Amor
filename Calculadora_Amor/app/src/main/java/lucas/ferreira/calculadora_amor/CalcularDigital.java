package lucas.ferreira.calculadora_amor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class CalcularDigital extends AppCompatActivity{

    private TextView tvResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular_digital);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        tvResposta = findViewById(R.id.cd_tv_resposta);

        Usuario u = new Usuario(CalcularDigital.this);
        Random r = new Random();

        u.setPorcentagem(r.nextInt(100));

        tvResposta.setText(u.biometria());

    }//Fecha OnCreate

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, MainActivity.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }

}//Fecha Classe
