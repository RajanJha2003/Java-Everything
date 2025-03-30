package stack;


import java.util.Stack;




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
		
		Stack<Emp> stack=new Stack<Emp>();
		stack.add(emp);
		stack.add(emp1);
		stack.add(emp2);
		stack.add(emp3);
		
		OperationsImp imp=new OperationsImp();
		imp.push(stack);
		imp.showData();
		
		imp.pop();
		imp.showData();
		
		System.out.println("--------------------------------");
		imp.peek();
		
		
	    
	}
	

}
