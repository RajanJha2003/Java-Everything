package covariant;


class Company{
	String companyName="RJ Tech";
	Company getDetails() {
		System.out.println(companyName);
		return new Company();
	}
	
}

class Emp extends Company {
	
	
	String empName="Rajan";
	@Override
	Emp getDetails() {
		// TODO Auto-generated method stub
		System.out.println(empName);
		return new Emp();
	}
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.getDetails();
		
		Company company=new Company();
		company.getDetails();
	}

}
