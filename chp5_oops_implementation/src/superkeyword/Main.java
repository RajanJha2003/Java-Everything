package superkeyword;

class Company{
	String companyName="RJ";
	
	void displayInfo() {
		System.out.println("info");
	}
}

class Emp extends Company {
	
	 void display() {
		// TODO Auto-generated method stub
		 System.out.println(super.companyName);
		 super.displayInfo();

	}
	
}




public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.display();
	}

}
