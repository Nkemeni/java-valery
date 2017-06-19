// Exercise 4.17 (Gas Mileage )
//GasMileage.java
import java.util.Scanner;
public class GasMileage { //beginning of class GasMileage

public static void main(String[] args){  //beginning of method main

int milesDriven = 0;
int gallonsUsed = 0;
int totalMilesDriven = 0;
int totalGallonsUsed = 0;
double milesPerGallon = 0.0;
int count = 0;

Scanner input = new Scanner(System.in);

while(milesDriven != -1){ // beginning of while block
 System.out.print("Enter miles driven or -1 to quit: "); // prompt
 milesDriven = input.nextInt();
 if(milesDriven != -1){ // beginning of if block
	count++; 
    //System.out.println();
    System.out.print("Enter gallons used: "); // prompt user to enter gallons used
	gallonsUsed = input.nextInt();
	milesPerGallon  = (double) milesDriven / gallonsUsed;
	System.out.printf("The miles per gallon for trip %d is: %.4f%n", count, milesPerGallon);
	totalMilesDriven += milesDriven;
	totalGallonsUsed += gallonsUsed;
	System.out.println();
 } // end of if
 } // end of while
double CombinedMilesPerGallon = (double) totalMilesDriven / totalGallonsUsed;
if(totalGallonsUsed != 0){
	System.out.println();
	System.out.printf("The combined miles per gallon is: %.5f%n%n", CombinedMilesPerGallon );
} // end of if
else 
	System.out.println("No trip taken");




}// end of method main

}// end of class GasMileage