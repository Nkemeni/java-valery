// Exercise 3.11
// AccountTest.java
// Modified Account test class

import java.util.Scanner;


public class AccountTest
{
public static void main(String[] args)
{
 // Create an account and display the initials
 Account account1 = new Account("Amazing", 9006.89);
 System.out.printf("The initials are: %s for account name and %.3f for balance%n%n",
				    account1.getName(), account1.getBalance());
 // Enter the withdrawal amount
 Scanner input = new Scanner(System.in);
 System.out.print("Please enter withdrawal amount ");
 double withdrawalAmount = input.nextDouble();
 // make the withdrawal
 account1.makeWithdrawal(withdrawalAmount);
// Print the balance
 System.out.printf("%n The current balance is: %.3f%n%n", account1.getBalance());


}

}