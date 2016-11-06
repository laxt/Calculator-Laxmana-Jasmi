import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.MethodsForAdvancedCalculator;

public class AdvanceFunctionsTest {

	MethodsForAdvancedCalculator calAdvance = new MethodsForAdvancedCalculator();
	public static final Logger LOG = Logger.getLogger(MethodsForAdvancedCalculator.class.getName());
	Random random = new Random();
	
      @Test 
      public void testPow() {
    	  double firstNumber = 0.0;
			double secondNumber = 0.0;
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				firstNumber = -100.0 + random.nextDouble()*200;
				secondNumber = -100.0 + random.nextDouble()*200;
				result = Math.pow(firstNumber, secondNumber);
				LOG.info("Testing the power method with the values " + firstNumber+" and "+ secondNumber +" = " + result);
				assertEquals("The result should be: "+ result, calAdvance.pow(firstNumber, secondNumber),result,0.001);
			}
			secondNumber = 0.5;
			firstNumber = -2;
			LOG.info("Testing negative number to power of 0.5 " + firstNumber+" and "+ secondNumber );
			assertTrue(calAdvance.pow(firstNumber, secondNumber)== -1111.1111);
      }
      
      
      
}
