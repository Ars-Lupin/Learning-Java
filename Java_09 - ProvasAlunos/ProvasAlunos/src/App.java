import java.util.Scanner;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale localeUS = new Locale("en", "US");
        sc.useLocale(Locale.US); // Força o Scanner a usar ponto como separador decimal

        int numAlunos = sc.nextInt();
        Turma turma = new Turma();

        for (int i = 0; i < numAlunos; i++)
        {
            String nome = sc.next();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            Aluno aluno = new Aluno(nome, n1, n2, n3);
            turma.adicionarAluno(aluno);
        }

        List<Aluno> alunosTurma = turma.getAlunos();
        double mediaTurma = turma.mediaTurma();

        System.out.println("Nome,Nota,Situacao,Media");

        for (Aluno a : alunosTurma)
        {
            System.out.printf(localeUS, "%s,%.1f,", a.get_nome(), a.media_aluno());

            double media_aluno = a.media_aluno();
            
            if (media_aluno >= 7.0) System.out.printf("Aprovado,");
            else System.out.printf("Prova Final,");

            if (media_aluno > mediaTurma) System.out.println("Acima");
            else if (media_aluno == mediaTurma) System.out.println("Na media");
            else System.out.println("Abaixo");
        }

        sc.close();
    }
}
