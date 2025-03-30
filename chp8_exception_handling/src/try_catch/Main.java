package try_catch;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

		
		int salary=100000;
		try {
			int bonus=salary/0;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			String empName=null;
			System.out.println(empName.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {

			String empName="Rajan";
			int i=Integer.parseInt(empName);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
		try {
			int arr[]=new int[5];
			arr[10]=20;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
	}

}
