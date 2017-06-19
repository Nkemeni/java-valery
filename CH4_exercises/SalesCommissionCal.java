// Ex 4.19 (Sales Commission Calculator)
//SalesCommissionCal

import java.util.Scanner;
public class SalesCommissionCal{ // beginning of class

public static void main(String[] args) { // beginning of method main
 
// declare local variables
double salesPersonCommision = 0.0;
int item = 0;
double value = 0.0;
double grossSales = 0.0;
int count = 0;
// enter items sold for the week
Scanner input = new Scanner(System.in);
while(item != -1){ // start of while block
System.out.print("Enter item sold or -1 to quit: ");
item = input.nextInt();
if(item != -1){ // start of if block
if(item == 1)
	value = 239.99;
else if(item == 2)
	value = 127.75;
else if (item == 3)
	value = 99.95;
else if (item == 4)
	value = 350.89;
grossSales += value;
count++;

}// end of if
}// end of while loop

salesPersonCommision = 0.09*grossSales;
System.out.printf("Your commision for the week for the sales of %d items is %.3f%n%n",
				    count, salesPersonCommision);
double earning = 200 + salesPersonCommision;
System.out.printf("Your earning for the week is: %.3f%n", earning);

}// end of method main

}// end of class
