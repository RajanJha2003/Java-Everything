package operations;

import java.util.ArrayList;

import pojo.Patient;

public interface PatientOperations {
	 void addPatient(ArrayList<Patient> patients);
	    void searchPatient(int id);
	    void getAllPatients();
	    void updatePatient(int id, Patient patient);
	    void removePatient(int id);
}
