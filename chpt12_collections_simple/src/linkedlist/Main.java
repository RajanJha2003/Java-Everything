package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
	LinkedList<Integer> linkedList=new LinkedList<Integer>();
	linkedList.add(10);
	linkedList.add(11);
	linkedList.add(12);
	linkedList.add(13);
	
	System.out.println(linkedList);
	
	linkedList.remove(2);
	System.out.println(linkedList);
	
	linkedList.set(1, 101);
	System.out.println(linkedList);
	
	int search=13;
	
	if(linkedList.contains(search)) {
		System.out.println("found at index: "+linkedList.indexOf(search));
	}else {
		System.out.println("Element not found");
	}
	
	
	Iterator iterator=linkedList.iterator();
	
	
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
		System.out.println("Element found at index :"+index);
	}else {
		System.out.println("Element not found-");
	}
	
	
}
}
