import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1)
        {
            System.out.printf("0 ");
        }

        else if (n != 0 && n != 1)
        {
            int fibonacci[] = new int[n];

            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i < n; i++)
            {
                fibonacci[i] = fibonacci[i - 2] + fibonacci[i -1];
            }

            for (int i = 0; i < n; i++)
            {
                System.out.printf("%d ", fibonacci[i]);
            }
        }

        sc.close();
    }
}
