import java.util.Arrays;


public class Eratosthenes {
    boolean[] primes;
    
    public Eratosthenes(int max) {
        primes=new boolean[max+1];
	}

	public void fillSieve() {
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
    }
}