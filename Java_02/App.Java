public class App {
	public static void main(String[] args) {
	    for (int abcd = 1000; abcd < 9999; abcd++) {
	        int ab = abcd / 100;
	        int cd = abcd % 100;
	        
	        int ef = ab + cd;
	        
	        if (Math.pow(ef, 2) == abcd) {
	            System.out.println(abcd);
	        }
	    }
	
	}
}