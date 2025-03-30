package final_keyword;

final class Emp{
	final int empId=10;
	final String empName="Tom";
	
	
	 final void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println(empId);
		System.out.println(empName);

	}
}






public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.displayInfo();
	}

}
