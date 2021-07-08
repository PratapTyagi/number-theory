import java.util.*;

public class SieveOfEratosthene {

	static boolean[] sieve(int n) {
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;

		for(int i=2; i*i<=n; i++) {
			for(int j=2*i; j<=n; j=j+i) {
				isPrime[j] = false;
			}
		}

		return isPrime;
	}	

	public static void main(String[] args) {
		// Range of prime nos.
		int n = 20;
		boolean[] isPrime = sieve(n);		
	
		for(int i=0; i<isPrime.length; i++)
			System.out.println(i+" -> "+isPrime[i]);
	}
}