package multi_catch_exception;

public class Main {
  public static void main(String[] args) {
	
	  try {

		  int arr[]=new int[5];
		  arr[10]=10/0;
	} catch (ArithmeticException e) {
		System.out.println(e);
		// TODO: handle exception
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
