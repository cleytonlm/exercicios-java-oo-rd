package exercicio02;

public abstract class Funcionario {

    private String  nome;
    private double salario;

    // TODO: implemente o código desta classe


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularsalario(){
        var calc = salario * 13;
    }

}