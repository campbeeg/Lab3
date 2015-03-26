package primeGenerator;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

	public List<Integer> generate(final Integer i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (i > 2)
			primes.add(2);
		return primes;
	}
	
}
