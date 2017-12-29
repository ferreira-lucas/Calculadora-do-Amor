package lucas.ferreira.calculadora_amor;

public class Validacao {

    public static boolean validarNome(String nome){
        String exp = "^[A-zÀ-ú ]{2,30}$";
        return nome.matches(exp);
    }

    public static boolean validarSexo(String sexo){
        String exp = "^[Masculino||Feminino||Outro]{6,9}$";
        return sexo.matches(exp);
    }
}
