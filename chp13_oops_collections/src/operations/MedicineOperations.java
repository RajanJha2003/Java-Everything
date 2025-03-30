package operations;

import java.util.ArrayList;

import pojo.Medicine;

public interface MedicineOperations {
	 void addMedicine(ArrayList<Medicine> Medicines);
	    void searchMedicine(int id);
	    void getAllMedicines();
	    void updateMedicine(int id, Medicine Medicine);
	    void removeMedicine(int id);
	    
	    
	    
	    
}
