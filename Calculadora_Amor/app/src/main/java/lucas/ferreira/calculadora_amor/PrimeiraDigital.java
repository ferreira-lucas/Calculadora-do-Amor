package lucas.ferreira.calculadora_amor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class PrimeiraDigital extends AppCompatActivity {

    private ImageButton btnLeitor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeira_digital);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        btnLeitor1 = findViewById(R.id.pd_btn_leitor);

        btnLeitor1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                telaSegBio(v);
                return false;
            }
        });
    }//Fecha onCreate

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

    public void telaSegBio(View view){
        Intent intent = new Intent(this,SegundaDigital.class);
        startActivity(intent);
        finish();
    }

}//Fecha Classe
