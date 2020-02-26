package exercicio02;

public class Gerente extends  Funcionario{

    private double bonusVariavel;

    private double valorvariavel;
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    private void setBonusVariavel() {
        double porcentagem = 10;
        double valor = 50;
        double resultado;

        resultado = (valor * porcentagem) / 100;
        resultado = +13 * getSalario();
    }


}