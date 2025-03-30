package multilevel_inheritance;



class Company{
	String companyName="RJ";
	 void displayCompanyInfo() {
		// TODO Auto-generated method stub
           System.out.println(companyName);
	}
}


class Department extends Company{
	String department="Developer";
	
	 void displayDeptInfo() {
		// TODO Auto-generated method stub
           System.out.println(department);
	}
}




class Employee extends Department {
	
	String empName="Rajan";
	
	 void displayInfo() {
		// TODO Auto-generated method stub
		 System.out.println(empName);

	}
	
}

public class Main {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.displayCompanyInfo();
		employee.displayDeptInfo();
		employee.displayInfo();
		
	}
	

}
