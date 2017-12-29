package lucas.ferreira.calculadora_amor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CalcularNome extends AppCompatActivity {

    private EditText etNome1;
    private EditText etNome2;
    private TextView tvResposta;
    private Button btnCalcular;
    private RadioGroup gpSexo1;
    private RadioGroup gpSexo2;
    private RadioButton rbMasculino1;
    private RadioButton rbFeminino1;
    private RadioButton rbOutro1;
    private RadioButton rbMasculino2;
    private RadioButton rbFeminino2;
    private RadioButton rbOutro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcular_nome);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        etNome1 = findViewById(R.id.cn_et_nome1);
        etNome2 = findViewById(R.id.cn_et_nome2);
        tvResposta = findViewById(R.id.cn_tv_resposta);
        btnCalcular = findViewById(R.id.cn_btn_calcular);
        gpSexo1 = findViewById(R.id.cn_gp_sexo1);
        gpSexo2  =findViewById(R.id.cn_gp_sexo2);
        rbMasculino1 = findViewById(R.id.cn_rb_masculino1);
        rbFeminino1 = findViewById(R.id.cn_rb_feminino1);
        rbOutro1 = findViewById(R.id.cn_rb_outro1);
        rbMasculino2 = findViewById(R.id.cn_rb_masculino2);
        rbFeminino2 = findViewById(R.id.cn_rb_feminino2);
        rbOutro2 = findViewById(R.id.cn_rb_outro2);

        gpSexo1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == rbMasculino1.getId()){
                    Toast.makeText(
                            getBaseContext(),
                            "O primeiro é homem",
                            Toast.LENGTH_LONG).show();
                }else if(checkedId == rbFeminino1.getId()){
                    Toast.makeText(
                            getBaseContext(),
                            "A primeira é mulher",
                            Toast.LENGTH_LONG).show();
                }else if(checkedId == rbOutro1.getId()){
                    Toast.makeText(
                            getBaseContext(),
                            "O primeiro é de outro gênero",
                            Toast.LENGTH_LONG).show();
                }//Fecha if/else
            }//Fecha onChecked
        });

        gpSexo2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == rbMasculino2.getId()){
                    Toast.makeText(
                            getBaseContext(),
                            "O segundo é homem",
                            Toast.LENGTH_LONG).show();
                }else if(checkedId == rbFeminino2.getId()){
                    Toast.makeText(
                            getBaseContext(),
                            "A segunda é mulher",
                            Toast.LENGTH_LONG).show();
                }else if(checkedId == rbOutro2.getId()){
                    Toast.makeText(
                            getBaseContext(),
                            "O segundo é de outro gênero",
                            Toast.LENGTH_LONG).show();
                }//Fecha if/else
            }//Fecha onChecked
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etNome1.getText().toString().isEmpty() || etNome2.getText().toString().isEmpty()){
                    Toast.makeText(
                            getBaseContext(),
                            "Campo(s) em branco!",
                            Toast.LENGTH_LONG).show();
                }else {
                    if(Validacao.validarNome(etNome1.getText().toString()) && Validacao.validarNome(etNome2.getText().toString())) {

                        Usuario u = new Usuario(CalcularNome.this);
                        Random r = new Random();
                        u.setNome1(etNome1.getText().toString());
                        u.setNome2(etNome2.getText().toString());

                        if (gpSexo1.getCheckedRadioButtonId() == rbMasculino1.getId()) {
                            u.setSexo1(rbMasculino1.getText().toString());
                        } else if (gpSexo1.getCheckedRadioButtonId() == rbFeminino1.getId()) {
                            u.setSexo1(rbFeminino1.getText().toString());
                        } else if (gpSexo1.getCheckedRadioButtonId() == rbOutro1.getId()) {
                            u.setSexo1(rbOutro1.getText().toString());
                        }

                        if (gpSexo2.getCheckedRadioButtonId() == rbMasculino2.getId()) {
                            u.setSexo2(rbMasculino2.getText().toString());
                        } else if (gpSexo2.getCheckedRadioButtonId() == rbFeminino2.getId()) {
                            u.setSexo2(rbFeminino2.getText().toString());
                        } else if (gpSexo2.getCheckedRadioButtonId() == rbOutro2.getId()) {
                            u.setSexo2(rbOutro2.getText().toString());
                        }

                        u.setPorcentagem(r.nextInt(100));
                        tvResposta.setText(u.toString());
                        limpar();

                    }else{

                        Toast.makeText(
                                getBaseContext(),
                                "Nome(s) inválido(s)!",
                                Toast.LENGTH_LONG).show();

                    }//Fehca if/else validação
                }//Fecha if/else isEmpty
            }
        });//fecha onClick

    }//fecha onCreate

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

    public void limpar(){
        etNome1.setText(null);
        etNome2.setText(null);

    }//fecha limpar
}//fecha Classe
