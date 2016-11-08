/**
 *  General Advance Calculator
 *  @author Laxmana-Jasmi
 */


package otherclasses;
import interfaces.CalculatorBasicOperations;

public class MethodsForSimpleCalculations implements CalculatorBasicOperations{
	/**
	 * Functions for addition
	 */
	
	public double add(double a, double b){
		return  a + b;
	}
	/**
	 * Functions for subtraction
	 */

	public double subtract(double a, double b){
		return  a - b;
	}
	/**
	 * Functions for multiplication
	 */

	public double multiply(double a, double b){
		return  a * b;
	}
	/**
	 * Functions for division and division by zero is checked throwing message
	 */

	public double divide (double a, double b){
	      if (b == 0) {
	          throw new IllegalArgumentException("Cannot divide by 0!");
	       }
	       return (double) a / b;

	}
}


	


	


