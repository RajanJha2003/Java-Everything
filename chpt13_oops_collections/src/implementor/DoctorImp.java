package implementor;

import java.util.ArrayList;
import java.util.Iterator;

import pojo.Doctor;

public class DoctorImp implements operations.DoctorOperations {
	
	ArrayList<Doctor> db=new ArrayList<Doctor>();
	

	@Override
	public void addDoctor(ArrayList<Doctor> doctors) {
		// TODO Auto-generated method stub
		db.addAll(doctors);
		System.out.println("doctor inserted");
		
		
	}

	@Override
	public void searchDoctor(int id) {
		// TODO Auto-generated method stub
		Iterator<Doctor> iterator=db.iterator();
		while (iterator.hasNext()) {
			Doctor doctor = (Doctor) iterator.next();
			if(doctor.getId()==id) {
				System.out.println(doctor);
				System.out.println("Doctor found");
			}
		}
		
	}

	@Override
	public void getAllDoctors() {
		// TODO Auto-generated method stub
		Iterator<Doctor> iterator=db.iterator();
		while (iterator.hasNext()) {
			Doctor doctor = (Doctor) iterator.next();
			System.out.println(doctor);
		}
		
		
	}

	@Override
	public void updateDoctor(int id, Doctor doc) {
		// TODO Auto-generated method stub
		Iterator<Doctor> iterator=db.iterator();
		while (iterator.hasNext()) {
			Doctor doctor = (Doctor) iterator.next();
			if(doctor.getId()==id) {
				db.set(db.indexOf(doctor), doc);
				System.out.println("Doctor updated");
				
			}
			
		}
		
		
	}

	@Override
	public void removeDoctor(int id) {
		// TODO Auto-generated method stub
		Iterator<Doctor> iterator=db.iterator();
		while (iterator.hasNext()) {
			Doctor doctor = (Doctor) iterator.next();
			if(doctor.getId()==id) {
				iterator.remove();
				System.out.println("Doctor deleted");
				
			}
			
		}
		
	}

}
