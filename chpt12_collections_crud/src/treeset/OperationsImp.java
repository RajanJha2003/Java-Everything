package treeset;



import java.util.HashSet;

import java.util.Iterator;

import java.util.TreeSet;


public class OperationsImp implements Operations {
   
	TreeSet<Emp> db=new TreeSet<Emp>();
	
	@Override
	public void insertData(TreeSet<Emp> emp) {
		
		db.addAll(emp);
		System.out.println("Data inserted successfully....");
		
	}

	@Override
	public void updateData(int id, String name) {
		Iterator<Emp> iterator=db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if(emp.getId()==id) {
				emp.setName(name);
				System.out.println("Data updated successfully...");
			}
		}
		
	}

	@Override
	public void deleteData(int id) {
		Iterator<Emp> iterator=db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if(emp.getId()==id) {
				iterator.remove();
				System.out.println("Data deleted......");
			}
		}
		
	}

	@Override
	public void searchData(int id) {
		Iterator<Emp> iterator=db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if(emp.getId()==id) {
				System.out.println("Data found");
				System.out.println(emp);
			}
		}
		
		
	}

	@Override
	public void showData() {
		Iterator<Emp> iterator=db.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			System.out.println(emp);
		}
				
	}

}
