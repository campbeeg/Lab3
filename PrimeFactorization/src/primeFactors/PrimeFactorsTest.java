package primeFactors;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {
	
	private List<Integer> list() {
		return Arrays.asList();
	}

	@Test
	public void test_Factor1() {
		assertEquals(list(), PrimeFactors.generate(1));
	}

}
