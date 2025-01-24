import java.util.ArrayList;
import java.util.List;

public class Primos {
    
    public static List<Integer> decompor_primos(int n)
    {
        List<Integer> fatoresPrimos = new ArrayList<Integer>();

        // Divide por dois enquanto for possível
        while (n % 2 == 0)
        {
            fatoresPrimos.add(2);
            n /= 2;
        }

        // Divide por números impáres a partir de 3
        for (int i = 3; i * i <= n; i+=2)
        {
            while (n % i == 0)
            {
                fatoresPrimos.add(i);
                n /= i;
            }
        }

        // Se restar um número primo maior que a raiz quadrada
        if (n > 2) fatoresPrimos.add(n);

        return fatoresPrimos;
    }
}
