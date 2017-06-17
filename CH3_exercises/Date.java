// Exercise 3.14
// Date class
//
public class Date {

private int month;
private int day;
private int year;

// Constructor for class date
public Date(int month, int day, int year){
// checking if its a valid month
if(month > 0)
	this.month = month;
// checking if its a valid day
if(day > 0)
	this.day = day;
// checking if its a valid year
if(year > 0)
	this.year = year;
}
// method to set month 
public void setMonth(int month){
if(month > 0)
	this.month = month;
}
// method to get month
public int getMonth(){
return month;
}
// method to set day 
public void setDay(int day){
if(day > 0)
	this.day = day;
}
// method to get day
public int getDay(){
return day;
}
// method to set year 
public void setYear(int year){
if(year > 0)
	this.year = year;
}
// method to get year
public int getYear(){
return year;
}
public void displayDate(Date date){

System.out.printf("%n The date is: %d/%d/%d%n%n",
			       date.getMonth(), date.getDay(), date.getYear());
}


}