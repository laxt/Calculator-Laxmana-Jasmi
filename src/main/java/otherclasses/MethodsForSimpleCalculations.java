/**
 *  General Advance Calculator
 *  @author Laxmana-Jasmi
 */


package otherclasses;

import javax.swing.JOptionPane;

import interfaces.*;

public class MethodsForSimpleCalculations implements CalculatorBasicOperations{
	
	public double add(double a, double b){
		return  a + b;
	}

	public double subtract(double a, double b){
		return  a - b;
	}
	
	public double multiply(double a, double b){
		return  a * b;
	}
	
	public double divide(double a, double b){
		double result = a / b;
		if (Double.isInfinite(result)){
			JOptionPane.showMessageDialog(null, "division by zero!", "Error message", JOptionPane.ERROR_MESSAGE);			
			return -1111.1111;
		}		
		
		return result;
	}

	
}

	


