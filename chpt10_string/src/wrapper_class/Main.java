package wrapper_class;

public class Main {
  public static void main(String[] args) {
	 int a=10;
	 Integer i=new Integer(a);  // primitive to wrapper class
	 System.out.println(i);  
	 
	 int q=i.intValue(); // wrapper class to primitive
	 System.out.println(q);
	 System.out.println(q+17);
	 
}
}
