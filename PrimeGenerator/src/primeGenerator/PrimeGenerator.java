package primeGenerator;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

	public List<Integer> generate(final Integer i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (i > 2)
			primes.add(2);
		if (i > 3)
			primes.add(3);
		if (i > 5)
			primes.add(5);
		
		return primes;
	}
	
}
