package basicclass;



class Emp{
	String name;
	int id;
	double sal;
	String address;
	
	
	 void displayInfo() {
		// TODO Auto-generated method stub
		 System.out.println(name);
		 System.out.println(id);
		 System.out.println(sal);
        System.out.println(address);
	}


	public Emp(String name, int id, double sal, String address) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp("Rajan", 10, 20000, "Mumbai");
		System.out.println(emp);
		emp.displayInfo();
		
	}

}
