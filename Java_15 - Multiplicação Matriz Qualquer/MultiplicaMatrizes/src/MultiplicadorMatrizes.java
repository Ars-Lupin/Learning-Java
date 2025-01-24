import java.util.Locale;

public class MultiplicadorMatrizes {

    private float matrizA[][];
    private float matrizB[][];
    private float matrizResultado[][];

    public MultiplicadorMatrizes(float matrizA[][], float matrizB[][], int linhasA, int colunasA, int linhasB, int colunasB)
    {
        this.matrizA = new float[linhasA][colunasA];
        this.matrizA = matrizA;

        this.matrizB = new float[linhasB][colunasB];
        this.matrizB = matrizB;

        this.matrizResultado = new float[linhasA][colunasB];
    }

    public void multiplicaMatrizes(int l, int c)
    {
        Locale localeUS = new Locale("en", "US");

        // Multiplicação das matrizes
		for (int i = 0; i < this.matrizResultado.length; i++)
		{
		    for (int j = 0; j < this.matrizResultado[i].length; j++)
		    {
		        for (int k = 0; k < this.matrizA[i].length; k++)
		        {
		            this.matrizResultado[i][j] += this.matrizA[i][k] * this.matrizB[k][j];
		        }
		    }
		}

        // Impressão da matriz resultado
        for (int i = 0; i < l; i++)
		{
		    for (int j = 0; j < c; j++)
		    {
                System.out.printf(localeUS, "%.2f", this.matrizResultado[i][j]);

                if (j < c - 1) System.out.printf(" ");
                else System.out.println("");
		    }
		}
    }
}
