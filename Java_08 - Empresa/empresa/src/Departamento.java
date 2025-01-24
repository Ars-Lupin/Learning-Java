import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    // Construtor departamento
    public Departamento(String nome)
    {
        this.nome = nome;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public String getNome()
    {
        return this.nome;
    }

    public List<Funcionario> getFuncionarios()
    {
        return this.funcionarios;
    }

    public void adicionarFuncionarios(Funcionario func)
    {
        this.funcionarios.add(func);
    }

    public void removerFuncionarios(Funcionario func)
    {
        this.funcionarios.remove(func);
    }

    public double custoTotalDepto()
    {
        double custoTotal = 0.0;
        for (Funcionario func : this.funcionarios)
        {
            custoTotal += func.getSalario();
        }
        return custoTotal;
    }
}