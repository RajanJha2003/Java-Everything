package implementor;

import java.util.ArrayList;
import java.util.Iterator;

import pojo.Medicine;
import pojo.Patient;


public class MedicineImp implements operations.MedicineOperations {
	
	ArrayList<Medicine> db=new ArrayList<Medicine>();
	

	@Override
	public void addMedicine(ArrayList<Medicine> medicines) {
		// TODO Auto-generated method stub
		db.addAll(medicines);
		
	}

	@Override
	public void searchMedicine(int id) {
		// TODO Auto-generated method stub
		Iterator<Medicine> iterator=db.iterator();
		while (iterator.hasNext()) {
			Medicine medicine = (Medicine) iterator.next();
			if(medicine.getId()==id) {
				System.out.println(medicine);
			}
			
		}
		
	}

	@Override
	public void getAllMedicines() {
		// TODO Auto-generated method stub
		Iterator<Medicine> iterator=db.iterator();
		while (iterator.hasNext()) {
			Medicine medicine = (Medicine) iterator.next();
			System.out.println(medicine);
			
		}
		
	}

	@Override
	public void updateMedicine(int id, Medicine medicines) {
		// TODO Auto-generated method stub
		Iterator<Medicine> iterator=db.iterator();
		while (iterator.hasNext()) {
			Medicine medicine = (Medicine) iterator.next();
			if(medicine.getId()==id) {
				db.set(db.indexOf(medicine), medicines);
				System.out.println("updated");
				
			}
			
		}
		
	}

	@Override
	public void removeMedicine(int id) {
		// TODO Auto-generated method stub
		Iterator<Medicine> iterator=db.iterator();
		while (iterator.hasNext()) {
			Medicine medicine = (Medicine) iterator.next();
			if(medicine.getId()==id) {
				iterator.remove();
				System.out.println("deleted");
				
			}
			
		}
	}

}
