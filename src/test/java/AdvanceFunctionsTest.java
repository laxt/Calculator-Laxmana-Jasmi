import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.MethodsForAdvancedCalculator;

/**
 * Calculator advanced functions class
 * 
 * @author Jasmi-Laxmana
 * 
 */

public class AdvanceFunctionsTest {

	MethodsForAdvancedCalculator calAdvance = new MethodsForAdvancedCalculator();
	public static final Logger LOG = Logger.getLogger(MethodsForAdvancedCalculator.class.getName());
	Random random = new Random();

	/**
	 * Testing power function using two random negative numbers with 50
	 * iterations
	 * 
	 */

	@Test
	public void testPow() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = -100.0 + random.nextDouble() * 200;
			secondNumber = -100.0 + random.nextDouble() * 200;
			result = Math.pow(firstNumber, secondNumber);
			LOG.info("Testing the power method with the values " + firstNumber + " and " + secondNumber + " = "
					+ result);
			assertEquals("The result should be: " + result, calAdvance.pow(firstNumber, secondNumber), result, 0.001);
		}
	}

	/**
	 * Testing power function using two random positive numbers with 50
	 * iterations
	 * 
	 * 
	 */
	@Test
	public void testPow2() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * 200;
			secondNumber = random.nextDouble() * 200;
			result = Math.pow(firstNumber, secondNumber);
			LOG.info("Testing the power method with the values " + firstNumber + " and " + secondNumber + " = "
					+ result);
			assertEquals("The result should be: " + result, calAdvance.pow(firstNumber, secondNumber), result, 0.001);
		}
	}

	/**
	 * Testing power function using one random negative number and one random
	 * positive number with 50 iterations
	 */
	@Test
	public void testPow3() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * -200;
			secondNumber = random.nextDouble() * 200;
			result = Math.pow(firstNumber, secondNumber);
			LOG.info("Testing the power method with the values " + firstNumber + " and " + secondNumber + " = "
					+ result);
			assertEquals("The result should be: " + result, calAdvance.pow(firstNumber, secondNumber), result, 0.001);
		}
	}

	/**
	 * Testing Sin method with a random positive number with 50 iterations
	 * 
	 */

	@Test
	public void testSin1() {
		double Number = 0.0;

		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * 200;

			result = Math.sin(Number);
			LOG.info("Testing the sin method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.sin(Number), result, 0.001);
		}
	}

	/**
	 * Testing Sin method with a random negative number with 50 iterations
	 * 
	 */

	@Test
	public void testSin2() {
		double Number = 0.0;

		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * -200;

			result = Math.sin(Number);
			LOG.info("Testing the sin method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.sin(Number), result, 0.001);
		}
	}

	/**
	 * Testing Sin method with zero.
	 * 
	 */
	@Test
	public void testSin3() {
		double Number = 0.0;
		double result = Math.sin(Number);
		LOG.info("Testing the sin method with the value " + Number + " and " + " = " + result);
		assertEquals("The result should be: " + result, calAdvance.sin(Number), result, 0.001);

	}

	/**
	 * Testing the Cos method with a random positive number with 50 iterations
	 * 
	 */

	@Test
	public void testCos1() {
		double Number = 0.0;

		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * 200;

			result = Math.cos(Number);
			LOG.info("Testing the cos method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.cos(Number), result, 0.001);
		}
	}

	/**
	 * Testing the Cos method with a random negative number with 50 iterations
	 * 
	 */
	@Test
	public void testCos2() {
		double Number = 0.0;

		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * -200;

			result = Math.cos(Number);
			LOG.info("Testing the cos method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.cos(Number), result, 0.001);
		}
	}

	/**
	 * Testing the Cos method with zero with 50 iterations
	 */
	@Test
	public void testCos3() {
		double Number = 0.0;

		double result = Math.cos(Number);
		LOG.info("Testing the cos method with the value " + Number + " and " + " = " + result);
		assertEquals("The result should be: " + result, calAdvance.cos(Number), result, 0.001);

	}

	/**
	 * Testing the Tan method with random positive numbers with 50 iterations
	 * 
	 */
	@Test
	public void testTan1() {
		double Number = 0.0;

		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * 200;

			result = Math.tan(Number);
			LOG.info("Testing the tan method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.tan(Number), result, 0.001);
		}
	}

	/**
	 * Testing the Tan method with random negative numbers with 50 iterations
	 * 
	 */
	@Test
	public void testTan2() {
		double Number = 0.0;

		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * -200;

			result = Math.tan(Number);
			LOG.info("Testing the tan method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.tan(Number), result, 0.001);
		}
	}

	/**
	 * Testing tan method with zero
	 */
	@Test
	public void testTan3() {
		double Number = 0.0;

		double result = Math.tan(Number);
		LOG.info("Testing the tan method with the value " + Number + " and " + " = " + result);
		assertEquals("The result should be: " + result, calAdvance.tan(Number), result, 0.001);

	}

	/**
	 * Testing the squareRoot method with random positive numbers
	 * 
	 */
	@Test
	public void testSquareRoot1() {
		double Number = 0.0;

		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * 200;

			result = Math.sqrt(Number);
			LOG.info("Testing the sqrt method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.squareRoot(Number), result, 0.001);
		}
	}

	/**
	 * Testing the Squareroot method with random negative numbers
	 * 
	 */
	@Test
	public void testSquareRoot2() {
		double Number = 0.0;

		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * -200;

			result = Math.sqrt(Number);
			LOG.info("Testing the sqrt method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.squareRoot(Number), result, 0.001);
		}
	}

	/**
	 * Testing the Squareroot method with zero
	 * 
	 */
	@Test
	public void testSquareRoot3() {
		double Number = 0.0;
		double result = Math.sqrt(Number);
		LOG.info("Testing the sqrt method with the value " + Number + " and " + " = " + result);
		assertEquals("The result should be: " + result, calAdvance.squareRoot(Number), result, 0.001);

	}

	/**
	 * Testing exponential function with a random positive number with 50
	 * iterations
	 * 
	 * 
	 */
	@Test
	public void testExp() {
		double Number = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * 200;

			double result = Math.exp(Number);
			LOG.info("Testing the exponential method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.exp(Number), result, 0.001);
		}

	}

	/**
	 * Testing exponential function with a random nagative number with 50
	 * iterations
	 * 
	 */

	@Test
	public void testExp1() {
		double Number = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * -200;

			double result = Math.exp(Number);
			LOG.info("Testing the exponential method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.exp(Number), result, 0.001);
		}

	}

	/**
	 * Testing exponential method with zero
	 * 
	 */

	@Test
	public void testExp2() {
		double Number = 0.0;
		double result = Math.exp(Number);
		LOG.info("Testing the exponential method with the value " + Number + " and " + " = " + result);
		assertEquals("The result should be: " + result, calAdvance.exp(Number), result, 0.001);
	}

	/**
	 * Testing the log method with random positive numbers with 50 iterations
	 * 
	 */

	@Test
	public void testLog1() {
		double Number = 0.0;

		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * 200;

			result = Math.log(Number);
			LOG.info("Testing the log method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.log(Number), result, 0.001);
		}
	}

	/**
	 * Testing the log method with random negative numbers with 50 iterations
	 * 
	 */
	@Test
	public void testLog2() {
		double Number = 0.0;

		double result = 0.0;
		for (int i = 0; i < 50; i++) {
			Number = random.nextDouble() * -200;

			result = Math.log(Number);
			LOG.info("Testing the log method with the value " + Number + " and " + " = " + result);
			assertEquals("The result should be: " + result, calAdvance.log(Number), result, 0.001);
		}
	}

	/**
	 * Testing the log method with zero
	 */
	@Test
	public void testLog3() {
		double Number = 0.0;
		double result = Math.log(Number);
		LOG.info("Testing the log method with the value " + Number + " and " + " = " + result);
		assertEquals("The result should be: " + result, calAdvance.log(Number), result, 0.001);

	}

}
