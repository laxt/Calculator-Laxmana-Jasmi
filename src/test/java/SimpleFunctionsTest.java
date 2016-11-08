import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.MethodsForSimpleCalculations;

public class SimpleFunctionsTest {
	/**
	 * Simple calcultor test class
	 * @author Jasmi-Laxmana
	 * 
	 * */


	MethodsForSimpleCalculations calBasic = new MethodsForSimpleCalculations();
	public static final Logger LOG = Logger.getLogger(MethodsForSimpleCalculations.class.getName());
	Random random = new Random();
	/**
	 * Testing add method with 2 random negative numbers with 50 iterations
	 * 
	 * 
	 * */

	@Test
	public void testAdd1() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = -100.0 + random.nextDouble()*200;
			secondNumber = -100.0 + random.nextDouble()*200;
			result = firstNumber + secondNumber;	
			LOG.info("Testing the add method with the values: "+ firstNumber+ " and " + secondNumber);
			assertEquals("The result should be: "+result,calBasic.add(firstNumber, secondNumber), result, 0.0001);
		}
		
	}
	/**
	 * Testing add method with 2 random positive numbers with 50 iterations
	 * 
	 * */
	@Test
	public void testAdd2() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*200;
			secondNumber =random.nextDouble()*200;
			result = firstNumber + secondNumber;	
			LOG.info("Testing the add method with the values: "+ firstNumber+ " and " + secondNumber);
			assertEquals("The result should be: "+result,calBasic.add(firstNumber, secondNumber), result, 0.0001);
		}
	}
	/**
	 * Test add method with zeros
	 * 
	 * */
	@Test
	public void testAdd3() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
			double result = firstNumber + secondNumber;	
			LOG.info("Testing the add method with the values: "+ firstNumber+ " and " + secondNumber);
			assertEquals("The result should be: "+result,calBasic.add(firstNumber, secondNumber), result, 0.0001);
		
	}
	/**
	 * Testing Subtract method with 2 random negative methods
	 * 
	 * 
	 * */


	@Test
	public void testSubtract1() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = -100.0 + random.nextDouble()*200;
			secondNumber = -100.0 + random.nextDouble()*200;
			result = firstNumber - secondNumber;
			LOG.info("Testing the subtract method with the values " + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, calBasic.subtract(firstNumber, secondNumber),result,0.0001);
		}
	}
	/**
	 * Testing subtract method with 2 random positive numbers
	 * 
	 * */
	@Test
	public void testSubtract2() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*200;
			secondNumber =random.nextDouble()*200;
			result = firstNumber - secondNumber;
			LOG.info("Testing the subtract method with the values " + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, calBasic.subtract(firstNumber, secondNumber),result,0.0001);
		}
	}
	/**
	 * Testing Subtract method with zeros
	 * 
	 * 
	 * */
	@Test
	public void testSubtract3() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
			double result = firstNumber - secondNumber;	
			LOG.info("Testing the add method with the values: "+ firstNumber+ " and " + secondNumber);
			assertEquals("The result should be: "+result,calBasic.subtract(firstNumber, secondNumber), result, 0.0001);
		
	}
	/**
	 * Testing multiply method with 2 random negative numbers with 50 iterations
	 * 
	 * */


	@Test
	public void testMultiply1() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = -100.0 + random.nextDouble()*200;
			secondNumber = -100.0 + random.nextDouble()*200;
			result = firstNumber * secondNumber;
			LOG.info("Testing the multiply method with the values " + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, calBasic.multiply(firstNumber, secondNumber),result,0.0001);
		}
	}
	/**
	 * Testing multiply method with 2 random positive numbers with 50 iterations
	 * 
	 * */
	@Test
	public void testMultiply2() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble()*200;
			secondNumber =random.nextDouble()*200;
			result = firstNumber * secondNumber;
			LOG.info("Testing the multiply method with the values " + firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result, calBasic.multiply(firstNumber, secondNumber),result,0.0001);
		}
	}
	/**
	 * Testing the multiply with zeros.
	 * 
	 * */
	@Test
	public void testMultiply3() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
			double result = firstNumber * secondNumber;	
			LOG.info("Testing the add method with the values: "+ firstNumber+ " and " + secondNumber);
			assertEquals("The result should be: "+result,calBasic.multiply(firstNumber, secondNumber), result, 0.0001);
		
	}
	
	 /** Testing for both positive numbers for simple division
	 * 
	 * */

	   @Test
	   public void testDivIntFail() {
	      assertNotEquals("error in divInt()", 1, calBasic.divide(9, 3));
	   }
	 
	   
	   /**
	    * Test for illegal exception
	    */
	   @Test(expected = IllegalArgumentException.class)
	   public void testDivIntByZero() {
		   calBasic.divide(9, 0); // expect an IllegalArgumentException
	   }
	 
	 /**
	  * Test for negative  
	  */
	   @Test
	   public void testDivRealPass() {
	      assertEquals("error in divInt()", 0.333333, calBasic.divide(1, 3), 1e-6);
	      assertEquals("error in divInt()", 0.111111, calBasic.divide(1, 9), 1e-6);
	   }
	   
	   
		 /** Testing divide by zero
		 * 
		 * */

	   @Test(expected = IllegalArgumentException.class)
	   public void testDivRealByZero() {
		   calBasic.divide(9, 0); // expect an IllegalArgumentException
	   }
	}

	



