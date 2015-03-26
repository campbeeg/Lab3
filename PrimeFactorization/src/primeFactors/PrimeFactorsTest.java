package primeFactors;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {
	
	private List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactors.generate(1));
	}
	
	@Test public void testTwo() {
		assertEquals(list(2), PrimeFactors.generate(2));
	}

}
