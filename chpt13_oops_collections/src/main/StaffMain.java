package main;

import java.util.ArrayList;
import implementor.StaffImp;
import pojo.Staff;

public class StaffMain {
    public static void main(String[] args) {
        Staff staff1 = new Staff();
        staff1.setId(101);
        staff1.setName("John Doe");
        staff1.setRole("Doctor");
        staff1.setSalary(90000);
        staff1.setExperience(10);

        Staff staff2 = new Staff();
        staff2.setId(102);
        staff2.setName("Jane Smith");
        staff2.setRole("Nurse");
        staff2.setSalary(50000);
        staff2.setExperience(5);

        Staff staff3 = new Staff();
        staff3.setId(103);
        staff3.setName("Robert Brown");
        staff3.setRole("Administrator");
        staff3.setSalary(60000);
        staff3.setExperience(8);

        Staff staff4 = new Staff();
        staff4.setId(104);
        staff4.setName("Emily Davis");
        staff4.setRole("Surgeon");
        staff4.setSalary(120000);
        staff4.setExperience(12);

        ArrayList<Staff> staffList = new ArrayList<>();
        staffList.add(staff1);
        staffList.add(staff2);
        staffList.add(staff3);
        staffList.add(staff4);

        StaffImp staffImp = new StaffImp();
        staffImp.addStaff(staffList);
        staffImp.getAllStaffs();
        System.out.println("------------------------");

        Staff staff5 = new Staff();
        staff5.setId(104);
        staff5.setName("Emily Davis");
        staff5.setRole("Head Surgeon");
        staff5.setSalary(150000);
        staff5.setExperience(15);

        staffImp.updateStaff(104, staff5);
        staffImp.getAllStaffs();
        System.out.println("------------------------------");

        staffImp.searchStaff(104);
        System.out.println("----------------------------");

        staffImp.removeStaff(103);
        staffImp.getAllStaffs();
    }
}
