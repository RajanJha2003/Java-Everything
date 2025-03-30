package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
  public static void main(String[] args) {
	  
	  Emp emp=new Emp("Rajan", 39, 1000000);
	  
	  
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
	 
	
}
}
