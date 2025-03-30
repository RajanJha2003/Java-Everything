package stack;

import java.util.Iterator;
import java.util.Stack;

public class Main {
public static void main(String[] args) {
	Stack<Integer> stack=new Stack<Integer>();
	 stack.push(10);
     stack.push(20);
     stack.push(30);
     stack.push(40);
     System.out.println(stack);
     
     stack.pop();
     System.out.println(stack);
     
     stack.set(2, 50);
     System.out.println(stack);
     
     int search=50;
     
     if(stack.contains(search)) {
    	 System.out.println("Element found at index: "+stack.indexOf(search));
     }else {
    	 System.out.println("Element not found");
     }
     
     Iterator iterator=stack.iterator();
     boolean found=false;
     int index=0;
     while (iterator.hasNext()) {
		if(iterator.next().equals(search)) {
			found=true;
			break;
			
		}
		index++;
		
	}
     
     if(found) {
    	 System.out.println("Element found at index: "+index);
     }else {
    	 System.out.println("Element not found");
     }
	
}
}
