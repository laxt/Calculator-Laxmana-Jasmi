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
      @Test 
      public void testPow2() {
    	  double firstNumber = 0.0;
			double secondNumber = 0.0;
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				firstNumber = random.nextDouble()*200;
				secondNumber =random.nextDouble()*200;
				result = Math.pow(firstNumber, secondNumber);
				LOG.info("Testing the power method with the values " + firstNumber+" and "+ secondNumber +" = " + result);
				assertEquals("The result should be: "+ result, calAdvance.pow(firstNumber, secondNumber),result,0.001);
			}
      }
      @Test 
      public void testPow3() {
    	  double firstNumber = 0.0;
			double secondNumber = 0.0;
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				firstNumber = random.nextDouble()*-200;
				secondNumber =random.nextDouble()*200;
				result = Math.pow(firstNumber, secondNumber);
				LOG.info("Testing the power method with the values " + firstNumber+" and "+ secondNumber +" = " + result);
				assertEquals("The result should be: "+ result, calAdvance.pow(firstNumber, secondNumber),result,0.001);
			}
      }
      
      @Test 
      public void testSin1() {
    	  double Number = 0.0;
			
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				Number = random.nextDouble()*200;
				
				result = Math.sin(Number);
				LOG.info("Testing the sin method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.sin(Number),result,0.001);
			}
      }
      @Test 
      public void testSin2() {
    	  double Number = 0.0;
			
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				Number = random.nextDouble()*-200;
				
				result = Math.sin(Number);
				LOG.info("Testing the sin method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.sin(Number),result,0.001);
			}
      }
      @Test 
      public void testSin3() {
    	  double Number = 0.0;
			double result = Math.sin(Number);
				LOG.info("Testing the sin method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.sin(Number),result,0.001);
			
      }
      
      @Test 
      public void testCos1() {
    	  double Number = 0.0;
			
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				Number = random.nextDouble()*200;
				
				result = Math.cos(Number);
				LOG.info("Testing the cos method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.cos(Number),result,0.001);
			}
      }
      @Test 
      public void testCos2() {
    	  double Number = 0.0;
			
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				Number = random.nextDouble()*-200;
				
				result = Math.cos(Number);
				LOG.info("Testing the cos method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.cos(Number),result,0.001);
			}
      }
      @Test 
      public void testCos3() {
    	  double Number = 0.0;
				
				double result = Math.cos(Number);
				LOG.info("Testing the cos method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.cos(Number),result,0.001);
			
      }
      @Test 
      public void testTan1() {
    	  double Number = 0.0;
			
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				Number = random.nextDouble()*200;
				
				result = Math.tan(Number);
				LOG.info("Testing the tan method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.tan(Number),result,0.001);
			}
      }
      @Test 
      public void testTan2() {
    	  double Number = 0.0;
			
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				Number = random.nextDouble()*-200;
				
				result = Math.tan(Number);
				LOG.info("Testing the tan method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.tan(Number),result,0.001);
			}
      }
      public void testTan3() {
    	  double Number = 0.0;
				
				double result = Math.tan(Number);
				LOG.info("Testing the tan method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.tan(Number),result,0.001);
			
      }
      @Test 
      public void testSquareRoot1() {
    	  double Number = 0.0;
			
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				Number = random.nextDouble()*200;
				
				result = Math.sqrt(Number);
				LOG.info("Testing the sqrt method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.squareRoot(Number),result,0.001);
			}
      }
      @Test 
      public void testSquareRoot2() {
    	  double Number = 0.0;
			
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				Number = random.nextDouble()*-200;
				
				result = Math.sqrt(Number);
				LOG.info("Testing the sqrt method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.squareRoot(Number),result,0.001);
			}
      }
      @Test 
      public void testSquareRoot3() {
    	  double Number = 0.0;
			double result = Math.sqrt(Number);
				LOG.info("Testing the sqrt method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.squareRoot(Number),result,0.001);
			
      }
      @Test 
      public void testPi() {
    	 
				
				double result = Math.PI;
				LOG.info("Testing the pi method");
				assertEquals("The result should be: "+ result, calAdvance.pi(0),result,0.001);
			
      }
      @Test 
      public void testLog1() {
    	  double Number = 0.0;
			
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				Number = random.nextDouble()*200;
				
				result = Math.log(Number);
				LOG.info("Testing the log method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.log(Number),result,0.001);
			}
      }
      @Test 
      public void testLog2() {
    	  double Number = 0.0;
			
			double result =0.0;
			for (int i = 0; i < 50; i++) {	
				Number = random.nextDouble()*-200;
				
				result = Math.log(Number);
				LOG.info("Testing the log method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.log(Number),result,0.001);
			}
      }
      @Test 
      public void testLog3() {
    	  double Number = 0.0;
				double result = Math.log(Number);
				LOG.info("Testing the log method with the value " + Number+" and "+ " = " + result);
				assertEquals("The result should be: "+ result, calAdvance.log(Number),result,0.001);
			
      }
      
      
      
      
      
      
     
      
      
      
}
