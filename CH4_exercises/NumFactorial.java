// EX 4.37 (Factorial)
//Factorial.java

import java.util.Scanner;
public class NumFactorial { // start of class

	public static void main(String[] args){ // start of method main
	
	int factorial = 1;
		
	// Enter number
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number (Caution: number must be a non-negative integer): ");
	int number = input.nextInt();
	int counter = 0;
	
		
	// Calculate the factorial
	while(counter < number){
	
	factorial *= (number - counter);
	counter++;
	
	}
	System.out.printf("%n The %d! is: %d%n", number, factorial);
	
	
	} // end of main
	
	
	
	
	}//end of class

