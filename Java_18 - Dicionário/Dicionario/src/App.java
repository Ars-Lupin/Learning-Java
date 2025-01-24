import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Map<String, String> dicionario = new HashMap<>();

        String entrada, termo, traducao;
        String condicaoParada = ".";

        // Cadastro das palavras e suas traduções
        while (true)
        {
            entrada = sc.nextLine().trim(); // trim() evita espaços desnecessários
            
            // Encerrar o programa quando receber "."
            if (entrada.equals(condicaoParada)) break;

            // Separa a string
            String[] partes = entrada.split(" = ");
            termo = partes[0];
            traducao = partes[1];

            if (dicionario.containsKey(termo))
            {
                System.out.println("Erro: TERMO já cadastrado. Digite novamente");
                continue;
            } 

            dicionario.put(termo, traducao);
        }

        // Consulta das traduções dos termos de entrada
        while (true)
        {
            String termoConsulta = sc.nextLine();
            
            // Encerrar o programa quando receber "."
            if (termoConsulta.equals(condicaoParada)) break;

            // Termo se encontra no dicionario
            if (dicionario.containsKey(termoConsulta)) System.out.printf("%s\n", dicionario.get(termoConsulta));
            else System.out.printf("Termo nao encontrado: %s\n", termoConsulta);
        }

        sc.close();
    }
}
