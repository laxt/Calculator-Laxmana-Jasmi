package otherclasses;

import interfaces.CalculatorAdvancedOperations;
import java.lang.Math.*;

public class MethodsForAdvancedCalculator implements CalculatorAdvancedOperations {

	public double sin(double a) {
		
		return Math.sin(a);
	}

	public double cos(double a) {
		
		return Math.cos(a);
	}

	public double tan(double a) {
		
		return Math.tan(a);
	}

	public double log(double a) {
	
		return Math.log(a);
	}

	public double squareRoot(double a) {
		
		return Math.sqrt(a) ;
	}

	public double pow(double a,double b) {
	
		return Math.pow(a, b);
	}

	public double pi(double a) {
		
		return Math.PI;
	}

	

}
