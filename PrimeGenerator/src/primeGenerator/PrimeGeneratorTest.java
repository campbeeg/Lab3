package primeGenerator;

import java.util.ArrayList;
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
   private List expectedResult;
   private PrimeGenerator primeGenerator;

   @Before
   public void initialize() {
      primeGenerator = new PrimeGenerator();
   }

   public PrimeGeneratorTest(Integer inputNumber, List expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { 2, new ArrayList<Integer>() },
      });
   }

   @Test
   public void testPrimeGenerator() {
      System.out.println("Parameterized Number is : " + inputNumber);
      assertEquals(expectedResult, primeGenerator.generate(inputNumber));
   }
}