
public class Fizzbuzz {
	public final static String FIZZ = "fizz";
	public final static String BUZZ = "buzz";
	
	public static void main(String[] args) {
		for (int i=1; i<=500; i++) {
			if (i % 5 != 0 && i % 7 != 0){
				System.out.print(i);
			}
			else {
				if (i % 5 == 0) {
					System.out.print(FIZZ);
				}
				if (i % 7 == 0) {
					System.out.print(BUZZ);
				}
			}
			System.out.println();
		}
	}

}
