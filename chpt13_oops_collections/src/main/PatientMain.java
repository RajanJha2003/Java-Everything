package main;

import java.util.ArrayList;

import implementor.PatientImp;
import pojo.Patient;

public class PatientMain {
  public static void main(String[] args) {
	Patient patient=new Patient();
	patient.setId(10);
	patient.setName("Tom");
	patient.setAge(20);
	patient.setDisease("Sick");
	patient.setBillAmount(10000);
	
	Patient patient1 = new Patient();
	patient1.setId(11);
	patient1.setName("Jerry");
	patient1.setAge(25);
	patient1.setDisease("Flu");
	patient1.setBillAmount(5000);

	Patient patient2 = new Patient();
	patient2.setId(12);
	patient2.setName("Alice");
	patient2.setAge(30);
	patient2.setDisease("Fever");
	patient2.setBillAmount(8000);

	Patient patient3 = new Patient();
	patient3.setId(13);
	patient3.setName("Bob");
	patient3.setAge(40);
	patient3.setDisease("Diabetes");
	patient3.setBillAmount(15000);
	
	ArrayList<Patient> arrayList=new ArrayList<Patient>();
	arrayList.add(patient);
	arrayList.add(patient1);
	arrayList.add(patient2);
	arrayList.add(patient3);
	
	
	PatientImp imp=new PatientImp();
	imp.addPatient(arrayList);
	imp.getAllPatients();
	System.out.println("-------------------------------------------");
	Patient patient4 = new Patient();
	patient4.setId(13);
	patient4.setName("Bobby");
	patient4.setAge(55);
	patient4.setDisease("Diabetes");
	patient4.setBillAmount(15000);
	
	imp.updatePatient(13, patient4);
	imp.getAllPatients();
	System.out.println("-------------------------------------------");
	
	imp.searchPatient(13);
	
	System.out.println("----------------------------------------------");
	imp.removePatient(13);
	imp.getAllPatients();

}
}
