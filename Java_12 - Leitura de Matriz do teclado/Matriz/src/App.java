import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale localeUS = new Locale("en", "US");

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Força o Scanner a usar ponto como separador decimal

        int l = sc.nextInt();
        int c = sc.nextInt();

        float matrix[][] = new float[l][c];

        for (int i = 0; i < l; i++)
        {
            for (int j = 0; j < c; j++)
            {
                matrix[i][j] = sc.nextFloat();
            }
        }

        for (int i = 0; i < l; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.printf(localeUS, "%.2f ", matrix[i][j]);

                if (j == c - 1) System.out.println("");
            }
        }

        sc.close();
    }
}
