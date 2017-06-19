// EX 4.18 (Credit Limit Calculator)
//CreditLimitCalculator.java

import java.util.Scanner;
public class CreditLimitCalculator{ // beginning of class

public static void main(String[] args){ // beginning of method main



// prompt user to input details
Scanner input = new Scanner(System.in);
System.out.print("Enter account number: ");
int accountNum = input.nextInt();
System.out.print("Enter ur balance at the beginning of the month: ");
int beginningBalance = input.nextInt();
System.out.print("Enter ur total charges for the month: ");
int totalCharges = input.nextInt();
System.out.print("Enter ur total credits applied for the month: ");
int totalCredits = input.nextInt();
System.out.print("Enter ur credit limit: ");
int creditLimit = input.nextInt();
// calculate and print new balance
int newBalance = beginningBalance + totalCharges - totalCredits;
System.out.printf("The New Balance is : %d%n", newBalance);
// check if credit limit is exceeded
if(newBalance > creditLimit)
	System.out.println("Credit Limit Exceeded");
	
} // end of method main

} // end of class