package exercicio02;

public class TecnicoManutencao extends  AuxiliarEscritorio{

    public TecnicoManutencao(String nome, double salario) {
        super(nome, salario);
    }

    private void calculoinsalubridade(){
        double porcentagem = 10;
        double valor = 40;
        double resultado;

        resultado = (valor *porcentagem)/100;
        resultado = + getSalario();
    }


}
