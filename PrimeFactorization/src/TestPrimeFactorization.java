import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrimeFactorization {

	@Test
	public void test() {
		PrimeFactorization pf = new PrimeFactorization(1); 
		assertArrayEquals(pf.factor(), new int[]{});
	}

}
