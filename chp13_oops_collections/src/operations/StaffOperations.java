package operations;

import java.util.ArrayList;

import pojo.Staff;



public interface StaffOperations {
	void addStaff(ArrayList<Staff> Staff);
    void searchStaff(int id);
    void getAllStaffs();
    void updateStaff(int id, Staff staff);
    void removeStaff(int id);
}
