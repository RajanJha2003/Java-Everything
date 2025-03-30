package vector;



import java.util.Vector;



public class Main {
  public static void main(String[] args) {
		Emp emp = new Emp();
        emp.setId(10);
        emp.setName("Rajan");
        emp.setSalary(1000000);

        Emp emp1 = new Emp();
        emp1.setId(11);
        emp1.setName("Tom");
        emp1.setSalary(250000);

        Emp emp2 = new Emp();
        emp2.setId(12);
        emp2.setName("Jerry");
        emp2.setSalary(300000);

        Emp emp3 = new Emp();
        emp3.setId(13);
        emp3.setName("Harry");
        emp3.setSalary(150000);
		
		Vector<Emp> vector=new Vector<Emp>();
		vector.add(emp);
		vector.add(emp1);
		vector.add(emp2);
		vector.add(emp3);
		
		OperationsImp imp=new OperationsImp();
		imp.insertData(vector);
		imp.showData();
		System.out.println(".....................................");
		imp.updateData(10, "Kary");
		imp.showData();
		System.out.println("......................................");
		imp.deleteData(10);
		imp.showData();
		System.out.println("......................................");
		imp.searchData(11);
		
		
		
		
}
}
