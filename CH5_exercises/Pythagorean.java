// Ex 5.21: (Pythagorean Triples)
// Pythagorean.java

public class Pythagorean { // beginning of class

	public static void main(String[] args){ // start of main
		int side1;
		int side2;
		int hypothenus;
		int lhs;
		int rhs;
		System.out.printf("%s%6s%12s%n", "side1", "side2", "hypothenus");
		for(side1 = 0; side1 <= 500; side1++){// start of side1 for loop
		   for(side2 = 0; side2 <= 500; side2++){// start of side2 for loop
		   
		      for(hypothenus = 0; hypothenus <= 500; hypothenus++){// start of hypothenus for loop
		          lhs = hypothenus*hypothenus; 
				  rhs = side1*side1 + side2*side2;
				  if(lhs == rhs)
					  System.out.printf("%4d%4d%5d%n", side1, side2, hypothenus);
			   }// end of hypothenus for loop
		   }// end of side2 for loop
		}// end of side1 for loop 
	
	}// end of main
}// end of class