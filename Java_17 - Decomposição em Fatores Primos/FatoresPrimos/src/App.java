import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> fatoresPrimos = Primos.decompor_primos(n);

        System.out.println(fatoresPrimos);

        sc.close();
    }
}
