package stack;



import java.util.ListIterator;
import java.util.Stack;




public class OperationsImp implements Operations {
	Stack<Emp> db=new Stack<Emp>();

	@Override
	public void push(Stack<Emp> emp) {
		// TODO Auto-generated method stub
		db.addAll(emp);
		System.out.println("pushed successfully");
		
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		db.pop();
		System.out.println("Popped");
		
	}

	@Override
	public void peek() {
		System.out.println(db.peek());
		
		System.out.println("Peek");
		
	}

	@Override
	public void showData() {
		ListIterator<Emp> listIterator=db.listIterator();
		while (listIterator.hasNext()) {
			Emp emp = (Emp) listIterator.next();
			System.out.println(emp);
		}
		
	}
   
	

}
