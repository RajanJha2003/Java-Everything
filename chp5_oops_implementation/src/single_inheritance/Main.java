package single_inheritance;


class Company{
	
	String companyName="RJ";
	 void displayCompany() {
		// TODO Auto-generated method stub
		 System.out.println(companyName);

	}
	
}



class Employee extends Company {
	
	String empName="Rajan";
	
	 void displayInfo() {
		// TODO Auto-generated method stub
		 System.out.println(empName);

	}
	
}

public class Main {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.displayCompany();
		employee.displayInfo();
	}
	

}
