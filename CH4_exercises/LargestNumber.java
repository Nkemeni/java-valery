//Ex 4.21 (Find the largest number)
//LargestNumber.java

import java.util.Scanner;
public class LargestNumber{  // start of class

public static void main(String[] args){ // start of method main
	
// local variable declaration
 int counter = 0;
 int number = 0;
 int largest = 0;

// determine the largest number
Scanner input = new Scanner(System.in);
while(counter < 10){ // start of while
	System.out.print("Enter number: ");
	number = input.nextInt();
	if(number > largest)
		largest = number;
counter++;
}// end of while

System.out.printf("The Largest Number is: %d%n", largest);

}// end of main

}// end of class