public class Employee {

	    String firstName;
	    String lastName;
	    double monthlySalary;

	    
	    public Employee(){
	    	
	    	
	    }
	    public Employee(String name, String name2, double salary) {
	        this.firstName = name;
	        this.lastName = name2;
	        this.monthlySalary = salary;
	    }
	    public String getFirstName() {
			return firstName;
		}
	    public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
	    public String getLastName() {
			return lastName;
		}
	    public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public double getMonthlySalary() {
			return monthlySalary;
		}
		public void setMonthlySalary(double monthlySalary) {
			this.monthlySalary = monthlySalary;
		}
	    public   double yearlySalary() {
	        double yearlySalary;
	        yearlySalary = (getMonthlySalary() * 12);
	        return yearlySalary;
	    }

	    public  double yearlySalaryIncrease() {
	        double yearlySalaryIncrease;
	        yearlySalaryIncrease = (((yearlySalary() * (0.1)) + yearlySalary()));
	        return yearlySalaryIncrease;
	    }

	    public  void displayYearlySalary() {
	        System.out.printf("%s %s's Yearly Salary is $%.2f\n", firstName, lastName,
	                yearlySalary());
	    }

	    public   void displayYearlySalaryIncrease() {
	        System.out.printf("%s %s = $%.2f\n", getFirstName(), getLastName(), yearlySalaryIncrease());
	    }

	}
