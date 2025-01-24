/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		float matrixA[][] = new float[5][4];
		float matrixB[][] = new float[4][6];
		
		Scanner input = new Scanner(System.in);
		
		// leitura da matriz A
		for (int i = 0; i < 5; i++)
		{
		    for (int j = 0; j < 4; j++)
		    {
		        float num = input.nextFloat();
		        matrixA[i][j] = num;
		    }
		}
		
		// leitura da matriz B
		for (int i = 0; i < 4; i++)
		{
		    for (int j = 0; j < 6; j++)
		    {
		        float num = input.nextFloat();
		        matrixB[i][j] = num;
		    }
		}
		
		float matrixResult[][] = new float[5][6];
        // Multiplicação das matrizes
		for (int i = 0; i < matrixResult.length; i++)
		{
		    for (int j = 0; j < matrixResult[i].length; j++)
		    {
		        for (int k = 0; k < matrixA[i].length; k++)
		        {
		            matrixResult[i][j] += matrixA[i][k] * matrixB[k][j];
		        }
		    }
		}
		
		// Resultado
		for (int i = 0; i < 5; i++)
		{
		    for (int j = 0; j < 6; j++)
		    {
		        System.out.printf("%.2f ", matrixResult[i][j]);
		        
		        if ( j == 5) System.out.printf("%n");
		    }
		}
		
		input.close();
	}
}
