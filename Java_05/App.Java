import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        boolean formaPA = true;
        int razao = vetor[1] - vetor[0];

        for (int i = 2; i < 10; i++) {
            if (vetor[i] - vetor[i - 1] != razao) {
                formaPA = false;
                break;
            }
        }

        if (formaPA) {
            System.out.println("Sim " + vetor[0] + " " + razao);
        } else {
            System.out.println("Nao");
        }

        scanner.close();
    }
}
