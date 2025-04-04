package main;

import java.util.ArrayList;

import implementor.DoctorImp;
import pojo.Doctor;

public class DoctorMain {
	public static void main(String[] args) {
		Doctor doctor1 = new Doctor();
		doctor1.setId(10);
		doctor1.setName("Tom");
		doctor1.setSalary(10000000);
		doctor1.setSpecialization("Cardiologist");
		doctor1.setExperience(2);

		Doctor doctor2 = new Doctor();
		doctor2.setId(11);
		doctor2.setName("Alice");
		doctor2.setSalary(8000000);
		doctor2.setSpecialization("Neurologist");
		doctor2.setExperience(5);

		Doctor doctor3 = new Doctor();
		doctor3.setId(12);
		doctor3.setName("David");
		doctor3.setSalary(9500000);
		doctor3.setSpecialization("Orthopedic");
		doctor3.setExperience(7);

		Doctor doctor4 = new Doctor();
		doctor4.setId(13);
		doctor4.setName("Sophia");
		doctor4.setSalary(7200000);
		doctor4.setSpecialization("Pediatrician");
		doctor4.setExperience(4);

		ArrayList<Doctor> arrayList = new ArrayList<Doctor>();
		arrayList.add(doctor1);
		arrayList.add(doctor2);
		arrayList.add(doctor3);
		arrayList.add(doctor4);

		DoctorImp doctorImp = new DoctorImp();
		doctorImp.addDoctor(arrayList);
		doctorImp.getAllDoctors();

		System.out.println("------------------------------------");

		Doctor doctor5 = new Doctor();
		doctor5.setId(13);
		doctor5.setName("Soph");
		doctor5.setSalary(720000);
		doctor5.setSpecialization("Neurologist");
		doctor5.setExperience(10);

		doctorImp.updateDoctor(13, doctor5);
		doctorImp.getAllDoctors();
		
		System.out.println("-------------------------------------------");
		
		doctorImp.searchDoctor(12);
		
		System.out.println("----------------------------------------------");
		
		doctorImp.removeDoctor(12);
		doctorImp.getAllDoctors();
		
		

	}
}
