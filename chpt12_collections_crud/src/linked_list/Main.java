package linked_list;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;



public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
        emp.setId(10);
        emp.setName("Rajan");
        emp.setSalary(1000000);

        Emp emp1 = new Emp();
        emp1.setId(11);
        emp1.setName("Tom");
        emp1.setSalary(250000);

        Emp emp2 = new Emp();
        emp2.setId(12);
        emp2.setName("Jerry");
        emp2.setSalary(300000);

        Emp emp3 = new Emp();
        emp3.setId(13);
        emp3.setName("Harry");
        emp3.setSalary(150000);
		
		LinkedList<Emp> linkedList=new LinkedList<Emp>();
		linkedList.add(emp);
		linkedList.add(emp1);
		linkedList.add(emp2);
		linkedList.add(emp3);
		
		OperationsImp imp=new OperationsImp();
		imp.insertData(linkedList);
		imp.showData();
		System.out.println("---------------------------------");
	    imp.updateData(13, "Kary");
	    imp.showData();
	    System.out.println("--------------------------------");
	    imp.deleteData(12);
	    imp.showData();
	    System.out.println("----------------------------------------");
	    imp.searchData(10);
	    
	}
	

}
