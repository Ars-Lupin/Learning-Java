import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Força o Scanner a usar ponto como separador decimal
        int num = scanner.nextInt();

        scanner.nextLine(); // Despreza o \n.

        CarrinhoDeCompras c = new CarrinhoDeCompras(num);

        for (int i = 0; i < num; i++) {

            String nome = scanner.nextLine();
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Despreza o \n.
            int qtd = scanner.nextInt();
            scanner.nextLine(); // Despreza o \n.
            c.adicionar(nome, preco, qtd);
        }

        c.imprimeConteudo();

        scanner.close();
    }
}
