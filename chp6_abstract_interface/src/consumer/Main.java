package consumer;

public class Main {
  public static void main(String[] args) {
	Manager manager=new Manager();
	System.out.println(manager.salary(10000,2000));
	
	Employee employee=new Employee();
	System.out.println(employee.salary(1000));
	
	
}
}
