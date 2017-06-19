//Ex 4.37 b
// ExponentialOne.java

import java.util.Scanner;

public class ExponentialOne{ // start of class

public static void main(String[] args){ // start of method main

	double exponentOne = 0.0;
	exponentOne = 1 + (1/getFactorial(1)) + (1/getFactorial(2)) + (1/getFactorial(3));
	System.out.printf("%n e is approx: %.5f%n", exponentOne );
}// end of method main

public static double getFactorial(int number){ // start of method getFactorial
	double factorial = 1.0;
	int counter = 0;
	while(counter < number){
	
	factorial *= (double)(number - counter);
	counter++;
	
	} // end of while
	return factorial;
}// end of method getFactorial
}// end of class