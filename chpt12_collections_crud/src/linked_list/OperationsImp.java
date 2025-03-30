package linked_list;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class OperationsImp implements Operations {
   
	LinkedList<Emp> db=new LinkedList<Emp>();
	
	@Override
	public void insertData(LinkedList<Emp> emp) {
		
		db.addAll(emp);
		System.out.println("Data inserted successfully....");
		
	}

	@Override
	public void updateData(int id, String name) {
		ListIterator<Emp> listIterator=db.listIterator();
		while (listIterator.hasNext()) {
			Emp emp = (Emp) listIterator.next();
			if(emp.getId()==id) {
				emp.setName(name);
				System.out.println("Data updated successfully...");
			}
		}
		
	}

	@Override
	public void deleteData(int id) {
		ListIterator<Emp> listIterator=db.listIterator();
		while (listIterator.hasNext()) {
			Emp emp = (Emp) listIterator.next();
			if(emp.getId()==id) {
				listIterator.remove();
				System.out.println("Data deleted......");
			}
		}
		
	}

	@Override
	public void searchData(int id) {
		ListIterator<Emp> listIterator=db.listIterator();
		while (listIterator.hasNext()) {
			Emp emp = (Emp) listIterator.next();
			if(emp.getId()==id) {
				System.out.println("Data found");
				System.out.println(emp);
			}
		}
		
		
	}

	@Override
	public void showData() {
		ListIterator<Emp> listIterator=db.listIterator();
		while (listIterator.hasNext()) {
			Emp emp = (Emp) listIterator.next();
			System.out.println(emp);
		}
				
	}

}
