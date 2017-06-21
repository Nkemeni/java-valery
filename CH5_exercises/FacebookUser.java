// Ex: 5.33 (Facebook User Base Growth)
// FacebookUser.java

public class FacebookUser{ // start of class

public static void main(String[] args){//start of main
int initialUserNum = 1000000000;
double rate = 0.04;
double months;
double prospectUserNum = 1500000000;

months = Math.log((double)prospectUserNum) / ((double)initialUserNum*Math.log(1 + rate));

System.out.printf("The number of months required for Facebook to hit 1.5 billion users is: %.1f%n",
				  months);
}// end of main
}// end of class