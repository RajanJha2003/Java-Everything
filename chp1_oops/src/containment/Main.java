package containment;

class Hobbies{
	String h1;
	String h2;
	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}
}


class Address{
	String areaname;
	String cityname;
	public Address(String areaname, String cityname) {
		super();
		this.areaname = areaname;
		this.cityname = cityname;
	}
	@Override
	public String toString() {
		return "Address [areaname=" + areaname + ", cityname=" + cityname + "]";
	}
}


class Emp{
	String name;
	int id;
	Address address;
	Hobbies hobbies;
	public Emp(String name, int id, Address address, Hobbies hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", address=" + address + ", hobbies=" + hobbies + "]";
	}
	
	
	
}


public class Main {
	
	public static void main(String[] args) {
		
		 Emp emp=new Emp("Rajan", 10, new Address("Mumbai", "kandivali"), new Hobbies("hr", "hr"));
		 System.out.println(emp);
		 System.out.println(emp.address.cityname);
	}

}
