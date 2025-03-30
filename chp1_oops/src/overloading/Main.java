package overloading;


class Account{
	double sal(int sal) {
		return sal;
	}
	
	double sal(int sal,int bonus) {
		return sal+bonus;
	}
	
	double sal(int sal,int bonus,int tax) {
		return sal+bonus-tax;
	}
}

public class Main {
  public static void main(String[] args) {
	Account account=new Account();
	System.out.println(account.sal(10000));
	System.out.println(account.sal(10000,2000));
	System.out.println(account.sal(100000, 20000, 10000));
}
}
