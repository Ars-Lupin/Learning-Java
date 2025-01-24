import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale localeBR = new Locale("pt", "BR");

        // Ler informações da empresa
        String nomeEmpresa = sc.next();
        String cnpj = sc.next();
        int numDeptos = sc.nextInt();

        Empresa empresa = new Empresa(nomeEmpresa, cnpj);

        for (int i = 0; i < numDeptos; i++)
        {
            String nomeDepto = sc.next();
            int numFuncionarios = sc.nextInt();

            Departamento depto = new Departamento(nomeDepto);

            for (int j = 0; j < numFuncionarios; j++)
            {
                String nomeFuncionario = sc.next();
                double salario = sc.nextDouble();
                String dataAdmissao = sc.next();

                Funcionario func = new Funcionario(nomeFuncionario, salario, dataAdmissao);
                depto.adicionarFuncionarios(func);
            }

            empresa.adicionarDepartamento(depto);
        }
        
        // Aumento de 10% para todos os funcionários do primeiro departamento
        Departamento primeiroDepto = empresa.getDepartamentos().get(0);
        for (Funcionario func : primeiroDepto.getFuncionarios())
        {
            double salarioAtual = func.getSalario();
            double novoSalario = salarioAtual * 1.10;
            func.setSalario(novoSalario);
        }
        
        // Transferir o primeiro funcionário do primeiro para o segundo departamento
        Departamento segundoDepto = empresa.getDepartamentos().get(1);
        Funcionario funcTransferido = primeiroDepto.getFuncionarios().get(0);
        primeiroDepto.removerFuncionarios(funcTransferido);
        segundoDepto.adicionarFuncionarios(funcTransferido);


        for (Departamento depto : empresa.getDepartamentos())
        {
            System.out.printf(localeBR, "%s R$ %.2f\n", depto.getNome(), depto.custoTotalDepto());
        }

        System.out.println("");
        sc.close();
    }
}
