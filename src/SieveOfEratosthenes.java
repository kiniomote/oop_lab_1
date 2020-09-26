
public class SieveOfEratosthenes {

	public static void main(String[] args) {
		boolean[] simpleNumbers = seed(Integer.parseInt(args[0]));
		for (boolean simpleNumber: simpleNumbers) {
			System.out.println(simpleNumber);
		}
	}
	
	public static boolean[] seed(int max) {
		Eratosthenes era = new Eratosthenes(max);
		era.fillSieve();
		return era.primes;
	}

}
