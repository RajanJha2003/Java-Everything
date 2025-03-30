package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        System.out.println(arrayList);

        // Delete element at index 2
        arrayList.remove(2);
        System.out.println(arrayList);

        // Update element at index 1
        arrayList.set(1, 101);
        System.out.println(arrayList);

        int search = 13;

     
        if (arrayList.contains(search)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        
        
        
    	
        boolean found = false;
        int index=0;
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
             
            if (iterator.next().equals(search)) {  
                found = true;
                break;  
            }
            index++;
       
        }

       
        if (found) {
            System.out.println("Element found at"+index);
        } else {
            System.out.println("Element not found");
        }
    }
}
