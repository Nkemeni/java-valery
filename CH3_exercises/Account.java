// Exercise 3.11
// The modified Account class
// Account.java

public class Account {
	private String name;
	private double balance;
//Account constructor
public Account(String name, double balance)
{
 this.name = name;
 if(balance > 0.0)
	 this.balance = balance;
}
// method that deposits (adds) only a valid amount to balance
public void deposit(double depositAmount){
   if(depositAmount > 0.0){
	   balance = balance + depositAmount;}
}
// method that withdraws an amount less than the current balance in the account
public void makeWithdrawal(double withdrawalAmount) {
 if(withdrawalAmount > balance)
	 System.out.println("Withdrawal greater that current balance");
 else 
	 balance = balance - withdrawalAmount;
}
// method that returns account balance
public double getBalance() {
  return balance;
}
// method to set account name
public void setName(String name){
	this.name = name;
}
// method to get account name
public String getName() {
  return name;
}


}


