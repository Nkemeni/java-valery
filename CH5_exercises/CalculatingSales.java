// Ex 5.17 Calculating Sales
// Class CalculatingSales.java

import java.util.Scanner;

public class CalculatingSales{ // beginning of class

public static void main(String[] args){// beginning of main

double productPrice = 0.0;
int prodNum = 0;
int quantity = 0;
double totalRetail = 0.0;

Scanner input = new Scanner(System.in);

while(prodNum != -1){// beginning of while
System.out.print("Enter product Number or -1 to quit: ");
prodNum = input.nextInt();

if(prodNum != -1){  //beginning of if 
System.out.print("Enter quantity sold: ");
quantity = input.nextInt();

switch(prodNum) {// beginning of switch

	case 1:
		productPrice = 2.98;
		break;
	case 2:
		productPrice = 4.50;
		break;
	case 3:
		productPrice = 9.98;
		break;
	case 4:
		productPrice = 4.49;
		break;
	case 5:
		productPrice = 2.98;
		break;
}// end of switch


}//end of if

totalRetail += productPrice*(double)quantity;
}// end of while

System.out.println();
System.out.printf("The toatal retail value is : %.2f%n", totalRetail );

}// end of main

}// end of class



