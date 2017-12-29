package lucas.ferreira.calculadora_amor;

import android.content.Context;

public class Usuario {

    private String nome1;
    private String nome2;
    private int porcentagem;
    private Context context;
    private String sexo1;
    private String sexo2;

    public Usuario(Context context) {
        this.context = context;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String getSexo1() {
        return sexo1;
    }

    public void setSexo1(String sexo1) {
        this.sexo1 = sexo1;
    }

    public String getSexo2() {
        return sexo2;
    }

    public void setSexo2(String sexo2) {
        this.sexo2 = sexo2;
    }

    @Override
    public String toString() {
        return nome1+" "+context.getResources().getString(R.string.e)+" "+nome2+" "+context.getResources().getString(R.string.possuem)+" "+porcentagem+context.getResources().getString(R.string.fim)+
                "\n"+
                "\n"+context.getResources().getString(R.string.sexo)+" "+nome1+": "+sexo1+
                "\n"+context.getResources().getString(R.string.sexo)+" "+nome2+": "+sexo2;
    }

    public String biometria(){
        return context.getResources().getString(R.string.cd_tv_resposta1)+" "+porcentagem+context.getResources().getString(R.string.cd_tv_resposta2);
    }
}
