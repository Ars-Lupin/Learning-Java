import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }
        
        int X = sc.nextInt();
        
        int maxDist = 0;
        int index1 = 0, index2 = 1; 
        
        for (int i = 0; i < 9; i++) {
            int dist = Math.abs(vetor[i] - vetor[i + 1]);
            if (dist > maxDist) {
                maxDist = dist;
                index1 = i;
                index2 = i + 1;
            }
        }
        
        String ordem = "Nao ordenado";
        boolean crescente = true;
        boolean decrescente = true;
        
        for (int i = 0; i < 9; i++) {
            if (vetor[i] < vetor[i + 1]) {
                decrescente = false;
            }
            if (vetor[i] > vetor[i + 1]) {
                crescente = false;
            }
        }
        
        if (crescente && !decrescente) {
            ordem = "Crescente";
        } else if (decrescente && !crescente) {
            ordem = "Decrescente";
        }
        
        int maiores = 0, menores = 0, iguais = 0;
        
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > X) {
                maiores++;
            } else if (vetor[i] < X) {
                menores++;
            } else {
                iguais++;
            }
        }
        
        System.out.println(index1 + " " + index2 + " " + ordem + " " + maiores + " " + menores + " " + iguais);
        
        sc.close();
    }
}
