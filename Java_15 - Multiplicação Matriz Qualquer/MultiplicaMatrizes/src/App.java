import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Leitura da matriz A

        int linhasA = sc.nextInt(); 
        
        if (linhasA <= 0)
        {
            System.out.println("Dimensão inválida");
            System.exit(0);
        }

        int colunasA = sc.nextInt();

        if (colunasA <= 0)
        {
            System.out.println("Dimensão inválida");
            System.exit(0);
        }

        float matrizA[][] = new float[linhasA][colunasA];

        for (int i = 0; i < linhasA; i++)
        {
            for (int j = 0; j < colunasA; j++)
            {
                matrizA[i][j] = sc.nextFloat();
            }
        }

        // Leitura da matriz B

        int linhasB = sc.nextInt(); 

        if (linhasB <= 0)
        {
            System.out.println("Dimensão inválida");
            System.exit(0);
        }

        int colunasB = sc.nextInt();

        if (colunasB <= 0)
        {
            System.out.println("Dimensão inválida");
            System.exit(0);
        }

        float matrizB[][] = new float[linhasB][colunasB];

        for (int i = 0; i < linhasB; i++)
        {
            for (int j = 0; j < colunasB; j++)
            {
                matrizB[i][j] = sc.nextFloat();
            }
        }

        if (colunasA == linhasB)
        {
            MultiplicadorMatrizes mm = new MultiplicadorMatrizes(matrizA, matrizB, linhasA, colunasA, linhasB, colunasB);
            mm.multiplicaMatrizes(linhasA, colunasB);
        } 
        else 
        {
            System.out.println("Dimensões não compatíveis");
        }

        sc.close();
    }
}
