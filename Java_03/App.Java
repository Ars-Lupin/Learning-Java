import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	    int mdc = 1;
	    Scanner scanner = new Scanner(System.in);
	    
	    int n1 = scanner.nextInt();
	    int n2 = scanner.nextInt();
	    
	    if (n1 > n2) {
	        for (int i = 2; i <= n2; i++) {
	            if (n1 % i == 0 && n2 % i == 0) {
	                if (i > mdc) {
	                    mdc = i;
	                }
	            }
	        }
	    }
	    else {
	        for (int i = 2; i <= n1; i++) {
	            if (n1 % i == 0 && n2 % i == 0) {
	                if (i > mdc) {
	                    mdc = i;
	                }
	            }
	        }
	    }
	    
	    System.out.println(mdc);
	}
}