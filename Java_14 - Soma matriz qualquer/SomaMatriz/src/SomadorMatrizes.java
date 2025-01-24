import java.util.Locale;

public class SomadorMatrizes {
    private float matrizA[][];
    private float matrizB[][];

    public SomadorMatrizes(float matrizA[][], float matrizB[][], int l, int c)
    {
        this.matrizA = new float[l][c];
        this.matrizA = matrizA;

        this.matrizB = new float[l][c];
        this.matrizB = matrizB;
    }

    public void somaMatrizes(int l, int c)
    {
        Locale localeUS = new Locale("en", "US");

        float soma = 0;

        for (int i = 0; i < l; i++)
        {
            for (int j = 0; j < c; j++)
            {
                soma = this.matrizA[i][j] + this.matrizB[i][j];
                System.out.printf(localeUS, "%.2f", soma);

                if (j == c - 1) System.out.println("");
                else System.out.println(" ");
            }
        }
    }
}
