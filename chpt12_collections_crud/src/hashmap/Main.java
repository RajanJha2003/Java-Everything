package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		// insert
		hashMap.put(1, "Rajan");
		hashMap.put(2, "Jha");
		hashMap.put(3, "Developer");

		System.out.println(hashMap);

		// update

		hashMap.put(3, "Web Developer");
		System.out.println(hashMap);

		// delete
		hashMap.remove(2);
		System.out.println(hashMap);

		// read

		Set set = hashMap.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}

}
