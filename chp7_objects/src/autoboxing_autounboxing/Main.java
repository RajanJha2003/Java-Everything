package autoboxing_autounboxing;



public class Main {
  public static void main(String[] args) {
	int balance=10000;
	
	// auto boxing
     Integer accountBalance=balance;
     
     // auto unboxing
     int deposit=accountBalance;
     
     System.out.println(accountBalance);
     System.out.println(deposit);
}
}
