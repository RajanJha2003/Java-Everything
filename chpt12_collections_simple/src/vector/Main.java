package vector;

import java.util.Iterator;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();

		vector.add("Rajan");
		vector.add("Jha");
		vector.add("Developer");
		System.out.println(vector);

		vector.remove(1);
		System.out.println(vector);

		vector.set(1, "web developer");
		System.out.println(vector);

		String search = "Rajan";

		if (vector.contains(search)) {
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}

		Iterator iterator = vector.iterator();

		boolean found = false;
		int index = 0;

		while (iterator.hasNext()) {

			if (iterator.next().equals(search)) {
				found = true;
				break;
			}
			index++;

		}

		if (found) {
			System.out.println("Element found at" + index);
		} else {
			System.out.println("Element not found-");
		}
	}
}
