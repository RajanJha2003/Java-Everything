package interface_class;


interface Company{
    String companyName = "RJ Tech";
    String location = "Mumbai";

	void work();
	void time();
}


class Manager implements Company{
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("work for manager");
		
	}

	@Override
	public void time() {
		// TODO Auto-generated method stub
		System.out.println("come in this time for manager");
		
	}
	
}


class Employee implements Company{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("work for employee");
		
	}

	@Override
	public void time() {
		// TODO Auto-generated method stub
		System.out.println("come in this time for employee");
		
	}
	
}




public class Main {
	
	public static void main(String[] args) {
		
		
		System.out.println(Company.companyName);
		System.out.println(Company.location);
		Manager manager=new Manager();
		manager.work();
		manager.time();
		
		
		
		System.out.println("---------------------------------------");
		
		
		Employee employee=new Employee();
		employee.work();
		employee.time();
	}

}
