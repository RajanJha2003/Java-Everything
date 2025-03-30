package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp>{
	int age;
	String name;
	double salary;
	public Emp(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp(20, "Rajan", 125000);
		Emp emp2=new Emp(17, "Jha",58000 );
		Emp emp3=new Emp(35, "Coder", 7800);
		Emp emp4=new Emp(16, "Developer", 85000);
		
		List<Emp> list=new ArrayList<Emp>();
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		System.out.println("Before sorting");
		
		Iterator<Emp> iterator=list.iterator();
		while (iterator.hasNext()) {
			Emp emp5 = (Emp) iterator.next();
			System.out.println(emp5);
			
		}
		
		System.out.println("After inserting");
		Collections.sort(list);
		Iterator<Emp> iterator1=list.iterator();
		while (iterator1.hasNext()) {
			Emp emp5 = (Emp) iterator1.next();
			System.out.println(emp5);
			
		}
		
	}
  
}
