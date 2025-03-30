package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
 public static void main(String[] args) {
	HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
	hashMap.put(1, "Rajan");
	hashMap.put(2, "Jha");
	hashMap.put(3, "Developer");
	
	System.out.println(hashMap);
	
	hashMap.remove(2);
	System.out.println(hashMap);
	
	hashMap.put(3, "Web Developer");
	System.out.println(hashMap);
	
	int key=1;
	if(hashMap.containsKey(key)) {
		System.out.println("Key found and value is : "+hashMap.get(key));
	}else {
		System.out.println("Not found");
	}
	
	
	
	
	
	
}
}
