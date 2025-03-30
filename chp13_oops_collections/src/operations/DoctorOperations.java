package operations;

import java.util.ArrayList;


import pojo.Doctor;

public interface DoctorOperations {
	 void addDoctor(ArrayList<Doctor> doctors);         
	    void searchDoctor(int id);             
	    void getAllDoctors();       
	    void updateDoctor(int id, Doctor doc); 
	    void removeDoctor(int id);            
}
