import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args)
    {
      Employee emp1 = new Employee("Valery", "Amazing", -700.00);
      System.out.printf("The initials are name: %s %s and Salary: %.3f%n%n",
                         emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary());
      Scanner input = new Scanner(System.in);
      System.out.print("Enter first name: ");
      String first = input.nextLine();
      emp1.setFirstName(first);
      System.out.print("Enter last name: ");
      String last = input.nextLine();
      emp1.setLastName(last);
      System.out.print("Enter Monthly Salary: ");
      double salary = input.nextDouble();
      emp1.setMonthlySalary(salary);
      System.out.printf("The Updated are name: %s %s and Salary: %.3f%n%n",
                         first, last, salary);
      System.out.printf("The Updated are name: %s %s and Salary: %.3f%n%n",
                         emp1.getFirstName(), emp1.getLastName(), emp1.getMonthlySalary());
    
    
    
    
    }
}