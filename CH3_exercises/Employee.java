public class Employee {
    
public Employee(String firstName, String lastName, double monthlySalary)
{
  this.firstName = firstName;
  this.lastName = lastName;
  if(monthlySalary > 0.0)
      this.monthlySalary = monthlySalary;
}
 String firstName;
 String lastName;
 double monthlySalary;
 
 public void setFirstName(String firstName)
 {
   this.firstName = firstName;
 }
 public String getFirstName()
 {
   return firstName;
 }
 public void setLastName(String lastName)
 {
   this.lastName = lastName;
 }
 public String getLastName()
 {
   return lastName;
 }
 public void setMonthlySalary(double monthlySalary)
 {  if(monthlySalary > 0.0)
      this.monthlySalary = monthlySalary;
 }
 public double getMonthlySalary()
 {
   return monthlySalary;
 }
}