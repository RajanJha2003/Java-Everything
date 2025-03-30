package heirarchical_inheritance;

class Company{
	
	String companyName="RJ";
	 void displayCompany() {
		// TODO Auto-generated method stub
		 System.out.println(companyName);

	}
	
}



class Employee extends Company {
	
	String empName="Rajan";
	
	 void displayEmpInfo() {
		// TODO Auto-generated method stub
		 System.out.println(empName);

	}
	
}


class Manager extends Company{
	String managerName="xyz";
	 void displayManagerInfo() {
		// TODO Auto-generated method stub
		 System.out.println(managerName);

	}
}

public class Main {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.displayCompany();
		employee.displayEmpInfo();
		
		
		System.out.println("-------------------------");
		
		
		Manager manager=new Manager();
		manager.displayCompany();
		manager.displayManagerInfo();
	}
	

}