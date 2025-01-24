import java.util.ArrayList;
import java.util.List;

public class Turma {
    
    private List<Aluno> alunos;

    public Turma()
    {
        this.alunos = new ArrayList<Aluno>();
    }

    public List<Aluno> getAlunos()
    {
        return this.alunos;
    }

    public void adicionarAluno(Aluno aluno)
    {
        this.alunos.add(aluno);
    }

    public double mediaTurma()
    {
        double soma = 0.0;
        double qtdAlunos = 0.0;
        for (Aluno al : this.alunos)
        {
            soma += al.media_aluno();
            qtdAlunos++;
        }
        return soma / qtdAlunos;
    }
}
