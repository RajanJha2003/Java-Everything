package finally_block;


public class Main {
  public static void main(String[] args) {
	System.out.println("Hello world");
	System.out.println("Hello world");
	int salary=10000;
	try {
		int bonus=salary/0;
	}
	finally {
		System.out.println("Finally block");
		System.out.println("Hello world");
		System.out.println("Hello world");
		
	}
}
}

