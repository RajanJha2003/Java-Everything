package finalize;



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
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
	System.out.println("Object deleted");
	}
	

}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp=new Emp("Rajan", 39, 1000000);
		
		
		emp=null;
		System.gc();
		
		
		
	}

}
