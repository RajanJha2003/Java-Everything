

package toString;

class Emp{
	String name;
	int id;
	double sal;
	public Emp(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
	

	

}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp=new Emp("Rajan", 39, 1000000);
		System.out.println(emp);
		
		
		
		
		
		
	}

}
