package equals_hashcode;

import java.util.Objects;

class Emp {
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
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}
	
	
}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp=new Emp("Rajan", 39, 1000000);
		Emp emp2=new Emp("Rajan", 39, 1000000);
		System.out.println(emp.equals(emp2));
		
		
	}

}
