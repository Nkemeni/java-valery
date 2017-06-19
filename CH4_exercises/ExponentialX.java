// Ex 4.37 c
//ExponentialX.java

import java.util.Scanner;

public class ExponentialX{ // start of class

public static void main(String[] args){ // start of method main
    Scanner input = new Scanner(System.in);
	System.out.print("Input x :");
	int x = input.nextInt();
	System.out.printf("%n e^%d is approx: %.5f%n", x, exponentialX(x) );
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

public static double exponentialX(int x){ // start of method exponential(x)

	double exponentX = 0.0;
	exponentX = (1 + ((double)x/getFactorial(1)) + ((double)(x*x)/getFactorial(2)) + ((double)(x*x*x)/getFactorial(3)) + ((double)(x*x*x*x)/getFactorial(4))
				+ ((double)(x*x*x*x*x)/getFactorial(5)) + ((double)(x*x*x*x*x*x)/getFactorial(6)));
	return exponentX;
}// end of method exponential(x)
}// end of class