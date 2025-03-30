package cloning;

class Emp implements Cloneable{
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp=new Emp("Rajan", 39, 1000000);
		
		Emp empClone=(Emp) emp.clone();
		System.out.println(empClone);
		
	}

}
