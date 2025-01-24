public class Funcionario {
    private String nome;
    private double salario;
    private String dataDeAdmissao;

    public Funcionario(String nome, double salario, String dataDeAdmissão)
    {
        this.nome = nome;
        this.salario = salario;
        this.dataDeAdmissao = dataDeAdmissão;
    }

    public String getNome()
    {
        return this.nome;
    }

    public double getSalario()
    {
        return this.salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
}
