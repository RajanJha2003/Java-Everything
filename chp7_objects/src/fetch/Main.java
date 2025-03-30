package fetch;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

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
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object deleted");
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
}

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp=new Emp("Rajan", 10, 2000000);
		Emp emp2=new Emp("Rajan", 10, 2000000);
		
		System.out.println(emp);
		
		System.out.println(emp.equals(emp2));
		
		Emp empClone=(Emp) emp.clone();
		System.out.println(empClone);
		
		Method method[]=emp.getClass().getMethods();
		
		for (int i = 0; i < method.length; i++) {
		System.out.println(method[i]);
			
		}
		Constructor constructor[]=emp.getClass().getConstructors();
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
			
		}
		Field field[]=emp.getClass().getFields();
		for (int i = 0; i < field.length; i++) {
		System.out.println(field[i]);
			
		}
	    
		
		emp=null;
		System.gc();
	}

}
