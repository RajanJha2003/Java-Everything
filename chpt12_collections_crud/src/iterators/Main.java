package iterators;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;



public class Main {
	public static void main(String[] args) {
		Emp emp=new Emp(10, "Rajan", 1000000);
		Emp emp1=new Emp(11, "Tom", 250000);
		Emp emp2=new Emp(12, "Jerry", 300000);
		Emp emp3=new Emp(13, "Harry", 150000);
		
		
		List<Emp> list=new ArrayList<Emp>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		
		// for each loop
		System.out.println("For each loop");
		for(Emp emps:list) {
			System.out.println(emps);
			
		}
		
		
		// using iterator
		System.out.println("Iterator");
		Iterator<Emp> iterator=list.iterator();
		while (iterator.hasNext()) {
			Emp emp4 = (Emp) iterator.next();
			System.out.println(emp4);
		}
		
		// using enumerator
		System.out.println("Enumerator");
		Vector<Emp> vector=new Vector<Emp>();
		vector.add(emp);
		vector.add(emp1);
		vector.add(emp2);
		vector.add(emp3);
		
		Enumeration<Emp> enumeration=vector.elements();
		
		while (enumeration.hasMoreElements()) {
			Emp emp4 = (Emp) enumeration.nextElement();
			System.out.println(emp4);
		}
		
		
		
		// list iterator
		
		System.out.println("List iterator");
		
		ListIterator<Emp> listIterator=list.listIterator();
		while (listIterator.hasNext()) {
			Emp emp4 = (Emp) listIterator.next();
			System.out.println(emp4);
			
		}
		
		System.out.println("previous");
		
		while (listIterator.hasPrevious()) {
			Emp emp4 = (Emp) listIterator.previous();
			System.out.println(emp4);
			
		}
		
		
		
		
		
	}

}
