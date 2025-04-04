package implementor;

import java.util.ArrayList;
import java.util.Iterator;

import pojo.Patient;
import pojo.Staff;

public class StaffImp implements operations.StaffOperations {
	ArrayList<Staff> db=new ArrayList<Staff>();

	@Override
	public void addStaff(ArrayList<Staff> staff) {
		// TODO Auto-generated method stub
		db.addAll(staff);
		System.out.println("inserted");
		
	}

	@Override
	public void searchStaff(int id) {
		// TODO Auto-generated method stub
		Iterator<Staff> iterator=db.iterator();
		while (iterator.hasNext()) {
			Staff staff = (Staff) iterator.next();
			if(staff.getId()==id) {
				System.out.println(staff);
			}
			
		}
	}

	@Override
	public void getAllStaffs() {
		// TODO Auto-generated method stub
		Iterator<Staff> iterator=db.iterator();
		while (iterator.hasNext()) {
			Staff staff = (Staff) iterator.next();
			System.out.println(staff);
			
		}
		
	}

	@Override
	public void updateStaff(int id, Staff staffs) {
		// TODO Auto-generated method stub
		Iterator<Staff> iterator=db.iterator();
		while (iterator.hasNext()) {
			Staff staff = (Staff) iterator.next();
			if(staff.getId()==id) {
				db.set(db.indexOf(staff), staffs);
				System.out.println("updated");
				
			}
			
		}
		
	}

	@Override
	public void removeStaff(int id) {
		// TODO Auto-generated method stub
		Iterator<Staff> iterator=db.iterator();
		while (iterator.hasNext()) {
			Staff staff = (Staff) iterator.next();
			if(staff.getId()==id) {
				iterator.remove();
				System.out.println("deleted");
				
			}
			
		}
		
	}

}
