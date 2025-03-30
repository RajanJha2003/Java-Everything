package map_crud;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		Emp e1 = new Emp();
        e1.setId(1);
        e1.setName("Rajan");

        Emp e2 = new Emp();
        e2.setId(2);
        e2.setName("Jha");

        Emp e3 = new Emp();
        e3.setId(3);
        e3.setName("Developer");

        // Using HashMap to store employee data
        hashMap.put(e1.getId(), e1.getName());
        hashMap.put(e2.getId(), e2.getName());
        hashMap.put(e3.getId(), e3.getName());
		
		OperationsImp imp=new OperationsImp();
		imp.insertData(hashMap);
		imp.showData();
		
		
		System.out.println("----------------------------------------------------");
		imp.updateData(3, "Web Developer");
		imp.showData();
		
		System.out.println("----------------------------------------------------");
		
		
		imp.deleteData(2);
		imp.showData();
		
		System.out.println("-------------------------------------------------");
		
		imp.searchData(1);
	
		
		
	}

}
