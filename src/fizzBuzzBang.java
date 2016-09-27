
public class fizzBuzzBang {

	public static void main(String[] args) {
	
		for(int i = 1; i <=110; i++) {
			
			if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0 )) {
				System.out.println("FIZZ BUZZ BANG");
			}
			
			else if (((i % 5) == 0) && ((i % 7) == 0)) {
				System.out.println("BUZZ BANG");
			}
			
			else if (((i % 3) == 0) && ((i % 7) == 0)) {
				System.out.println("FIZZ BANG");
			}
			
			else if (((i % 3) == 0) && ((i % 5) == 0)) {
				System.out.println("FIZZ BUZZ");
			}
			
			else if ((i % 7) == 0) {
				System.out.println("BANG");
			}
			
			else if ((i % 5) == 0) {
				System.out.println("BUZZ");
			}
			
			else if ((i % 3) == 0) {
				System.out.println("FIZZ");
			}
			
			else {
				System.out.println(i);
			}
		}

	}

}
