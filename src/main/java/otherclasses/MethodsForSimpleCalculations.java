/**
 *  General Advance Calculator
 *  @author Laxmana-Jasmi
 */


package otherclasses;

import javax.swing.JOptionPane;

import interfaces.*;

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
		double result = a / b;
		if (Double.isInfinite(result)){
			System.out.println("Something went wrong! "+"Maybe you tried to divide by 0?");
			return -0.123456789;
		} else {
			return a / b;
		}
	}

	
}

	


