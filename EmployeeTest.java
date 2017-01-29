import java.util.Scanner;

	public class EmployeeTest {

   
	    public static void main(String[] args) {
		     Employee Employee1 = new Employee();
		       Employee Employee2 = new Employee("Tom","bob",45.25);
		       Employee1.setFirstName("jack");
		       Employee1.setLastName("cruz");
		       Employee1.setMonthlySalary(55.11);
		       System.out.println("firstEmployee firstName: "+Employee1.getFirstName());
		       System.out.println("firstEmployee lastName: "+Employee1.getLastName());
		       System.out.println("firstEmployee Salary: "+Employee1.getMonthlySalary());
		       
		       System.out.println("SecondEmployee firstName: "+Employee2.getFirstName());
		       System.out.println("SecondEmployee lastName: "+Employee2.getLastName());
		       System.out.println("SecondEmployee Salary: "+Employee2.getMonthlySalary());
		       	
		       
		       System.out.println("FirstEmployee yearly salary: "+Employee1.yearlySalary());
		       System.out.println("SecondEmployee yearly salary: "+Employee2.yearlySalary());
		       Employee1.yearlySalaryIncrease();
		       Employee2.yearlySalaryIncrease();
		       
		       System.out.println("After 10% incrment, salary is");
		       
		       Employee1.displayYearlySalaryIncrease();
		       Employee2.displayYearlySalaryIncrease();
		       
	   
	    }
	}
