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
	 * Functions for division and division by zero is checked
	 */

	public double divide(double a, double b){
		double result = a / b;
		if (Double.isInfinite(result)){
			JOptionPane.showMessageDialog(null, "division by zero!", "Error message", JOptionPane.ERROR_MESSAGE);			
			return -1111.1111;
		}		
		
		return result;
	}

	
}

	


