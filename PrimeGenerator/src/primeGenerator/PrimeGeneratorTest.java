package primeGenerator;

import java.util.Arrays;
import java.util.Collection;
 
import java.util.List;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeGeneratorTest {
   private Integer inputNumber;
   private List<Integer> expectedResult;
   private PrimeGenerator primeGenerator;
   
   private static List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}

   @Before
   public void initialize() {
      primeGenerator = new PrimeGenerator();
   }

   public PrimeGeneratorTest(Integer inputNumber, List<Integer> expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { 2, list() },
         { 3, list(2) },
         { 4, list(2, 3) },
         { 6, list(2, 3, 5) },
         { 8, list(2, 3, 5, 7) },
         { 11, list(2, 3, 5, 7) },
         { 30, list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29) }
      });
   }

   @Test
   public void testPrimeGenerator() {
      System.out.println("Parameterized Number is : " + inputNumber);
      assertEquals(expectedResult, primeGenerator.generate(inputNumber));
   }
}