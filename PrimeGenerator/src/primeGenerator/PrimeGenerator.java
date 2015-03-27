package primeGenerator;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

	public List<Integer> generate(final Integer i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();

		if (i > 2) {
			primes.add(2);

			for (int j = 2; j < i; j++) {
				for (int k = 2; k < j; k++) {
					if (j % k == 0) {
						break;
					}
					if (k == (j - 1))
						primes.add(j);
				}
			}
		}

		return primes;
	}

}
