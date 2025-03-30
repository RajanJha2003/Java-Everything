package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


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
		
		Collections.sort(list, new AgeComparator());
		
		Iterator<Emp> iterator=list.iterator();
		while (iterator.hasNext()) {
			Emp emp5 = (Emp) iterator.next();
			System.out.println(emp5);
			
		}
}
}
