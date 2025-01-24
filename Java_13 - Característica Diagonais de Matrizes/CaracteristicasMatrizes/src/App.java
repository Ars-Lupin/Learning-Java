import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();

        int matriz[][] = new int[l][l];

        for (int i = 0; i < l; i++)
        {
            for (int j = 0; j < l; j++)
            {
                matriz[i][j] = sc.nextInt();
            }
        }

        char c = sc.next().charAt(0);

        switch (c) {
            case 'd':

                int naoEhDiag = 0;

                for (int i = 0; i < l; i++)
                {
                    for (int j = 0; j < l; j++)
                    {
                        if (i == j && matriz[i][j] == 0) naoEhDiag = 1;
                    }

                    if (naoEhDiag == 1) break;
                }

                if (naoEhDiag == 0) System.out.printf("A matriz é diagonal\n");
                else System.out.printf("A matriz não é diagonal\n");
                break;

            case 'i':

                int naoEhDiagInf = 0;

                for (int i = 0; i < l; i++)
                {
                    for (int j = 0; j < l; j++)
                    {
                        if (i < j && matriz[i][j] != 0) naoEhDiagInf = 1;
                    }

                    if (naoEhDiagInf == 1) break;
                }

                if (naoEhDiagInf == 0) System.out.printf("A matriz é diagonal inferior\n");
                else System.out.printf("A matriz não é diagonal inferior\n");
                break;

            case 's':

                int naoEhDiagSup = 0;

                for (int i = 0; i < l; i++)
                {
                    for (int j = 0; j < l; j++)
                    {
                        if (i > j && matriz[i][j] != 0) naoEhDiagSup = 1;
                    }

                    if (naoEhDiagSup == 1) break;
                }

                if (naoEhDiagSup == 0) System.out.printf("A matriz é diagonal superior\n");
                else System.out.printf("A matriz não é diagonal superior\n");
                break;
        
            default:
                break;
        }

        sc.close();
    }
}
