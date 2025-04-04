package implementor;

import java.util.ArrayList;
import java.util.Iterator;

import pojo.Patient;

public class PatientImp implements operations.PatientOperations {
	
	ArrayList<Patient> db=new ArrayList<Patient>();
	

	@Override
	public void addPatient(ArrayList<Patient> patients) {
		// TODO Auto-generated method stub
		db.addAll(patients);
		System.out.println("Patient inserted");
		
	}

	@Override
	public void searchPatient(int id) {
		// TODO Auto-generated method stub
		Iterator<Patient> iterator=db.iterator();
		while (iterator.hasNext()) {
			Patient patient = (Patient) iterator.next();
			if(patient.getId()==id) {
				System.out.println(patient);
			}
			
		}
		
	}

	@Override
	public void getAllPatients() {
		// TODO Auto-generated method stub
		Iterator<Patient> iterator=db.iterator();
		while (iterator.hasNext()) {
			Patient patient = (Patient) iterator.next();
			System.out.println(patient);
			
		}
		
	}

	@Override
	public void updatePatient(int id, Patient patients) {
		// TODO Auto-generated method stub
		Iterator<Patient> iterator=db.iterator();
		while (iterator.hasNext()) {
			Patient patient = (Patient) iterator.next();
			if(patient.getId()==id) {
				db.set(db.indexOf(patient), patients);
				System.out.println("updated");
				
			}
			
		}
		
		
	}

	@Override
	public void removePatient(int id) {
		// TODO Auto-generated method stub
		Iterator<Patient> iterator=db.iterator();
		while (iterator.hasNext()) {
			Patient patient = (Patient) iterator.next();
			if(patient.getId()==id) {
				iterator.remove();
				System.out.println("deleted");
				
			}
			
		}
		
		
	}

}
