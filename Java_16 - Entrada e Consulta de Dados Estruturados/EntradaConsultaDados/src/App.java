import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Map<Integer, Usuario> usuarios = new HashMap<>();

        // Entrada: número de usuários
        int qtdPessoas = sc.nextInt();
        sc.nextLine(); // Consumir quebra de linha 

        for (int i = 0; i < qtdPessoas; i++)
        {
            int rg = sc.nextInt();
            sc.nextLine(); // Consumir quebra de linha

            if (usuarios.containsKey(rg))
            {
                System.out.println("Erro: RG já cadastrado. Digite os dados novamente");
                i--; // Repetir a iteração para corrigir o cadastro
                continue;
            }

            String nome = sc.next();
            int idade = sc.nextInt();
            sc.nextLine(); // Consumir quebra de linha

            Usuario u = new Usuario(rg, nome, idade);
            usuarios.put(rg, u);
        }

        // Consulta de usuario
        while(true)
        {
            String consulta = sc.nextLine().trim(); // trim() evita espaços desnecessários

            // Encerrar o programa quando não houver entrada
            if (consulta.isEmpty()) break;

            // Processar consulta
            String[] partes = consulta.split(" ");
            if (partes.length == 2)
            {
                try
                {
                    int rg = Integer.parseInt(partes[0]); // Pega a primeira parte da consulta e transforma em Int
                    String campo = partes[1]; // Pega a segunda parte da consulta, sem transformação

                    if (usuarios.containsKey(rg))
                    {
                        Usuario usuario = usuarios.get(rg);
                        if ("Nome".equalsIgnoreCase(campo))
                        {
                            System.out.println(usuario.getNome());
                        } else if ("Idade".equalsIgnoreCase(campo)) {
                            System.out.println(usuario.getIdade());
                        } else {
                            System.out.println("Erro: Campo inválido. Use 'Nome' ou 'Idade'.");
                        }
                    } else {
                        System.out.println("Erro: RG não cadastrado");
                    }
                } catch (NumberFormatException e) { // Evitar que o programa seja interrompido por uma entrada inválida
                    System.out.println("Erro: Formato de RG inválido.");
                } 
            } else {
                System.out.println("Erro: Entrada inválida. Use o formato 'RG XXXX'.");
            }
        }

        sc.close();
    }
}
