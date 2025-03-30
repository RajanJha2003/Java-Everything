package passing_class_as_parameter;

class EmpInfo{
	String firstName;
	String lastName;
	String middleName;
	public EmpInfo(String firstName, String lastName, String middleName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	@Override
	public String toString() {
		return "EmpInfo [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName + "]";
	}
	
	void displayInfo() {
		System.out.println(firstName+" "+middleName+" "+lastName);
	}
	
}


class Address{
	String buildingName;
	String wingname;
	int flatno;
	String area;
	public Address(String buildingName, String wingname, int flatno, String area) {
		super();
		this.buildingName = buildingName;
		this.wingname = wingname;
		this.flatno = flatno;
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", wingname=" + wingname + ", flatno=" + flatno + ", area="
				+ area + "]";
	}
	
	
	void displayAddress() {
		System.out.println(buildingName+" "+wingname+" "+flatno+" "+area);
	}
}



class Salary{
	double sal;
	double tax;
	public Salary(double sal, double tax) {
		super();
		this.sal = sal;
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Salary [sal=" + sal + ", tax=" + tax + "]";
	}
	
	
	void displaySalary() {
		System.out.println(sal + " " +tax);
	}
}


class Emp{
	void show(EmpInfo empInfo,Address address,Salary salary ) {
		empInfo.displayInfo();
		address.displayAddress();
		salary.displaySalary();
		
	}
}


public class Main {
	public static void main(String[] args) {
		
		Emp emp=new Emp();
		emp.show(new EmpInfo("Tom","Wom", "Dom"), new Address("XYZ", "A", 107, "Kandivali"), new Salary(10000, 2000));
		
		
		
	}

}
