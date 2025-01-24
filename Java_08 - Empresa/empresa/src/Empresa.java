import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<Departamento> departamentos;

    // Construtor empresa
    public Empresa(String nome, String cnpj)
    {
        this.nome = nome;
        this.cnpj = cnpj;
        this.departamentos = new ArrayList<Departamento>();
    }

    public void adicionarDepartamento(Departamento depto)
    {
        this.departamentos.add(depto);
    }

    public List<Departamento> getDepartamentos()
    {
        return this.departamentos;
    }
}
