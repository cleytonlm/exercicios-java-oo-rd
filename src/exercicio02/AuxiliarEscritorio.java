package exercicio02;

public class AuxiliarEscritorio  extends Funcionario{
    private double bonusAnual = 400;

    public AuxiliarEscritorio(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    // TODO: implemente o código desta classe


    @Override
    public void calcularsalario() {
        bonusAnual = + getSalario();

    }
}