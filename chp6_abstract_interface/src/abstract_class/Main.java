package abstract_class;

abstract class Company {

	abstract void salary();
	
	static String companyName="RJ Tech";

	static void companyInfo() {
		System.out.println(companyName);
	}

	void displayEmpDetails() {
		System.out.println("details");
	}
}

class Employee extends Company {

	@Override
	void salary() {
		System.out.println("Salary:100000");

	}

}

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.salary();
		employee.displayEmpDetails();
	    Employee.companyInfo();

	}
}
