import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); // Força o Scanner a usar ponto como separador decimal

		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();

		Ponto p1 = new Ponto(x1, y1);
		Ponto p2 = new Ponto(x2, y2);
		Ponto p3 = new Ponto(x3, y3);

		Triangulo t = new Triangulo(p1, p2, p3);

		double perimetro = t.calculaPerimetro();

		System.out.printf("%.5f\n", perimetro);
	    
		sc.close();
	}
}
