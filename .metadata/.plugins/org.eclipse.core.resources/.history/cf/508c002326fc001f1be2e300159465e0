package user_defined_exception;

class BalanceException extends Exception {
	public BalanceException() {
	   super("Low balance");  
	}
	
}



class Account {
	int amt=100000;
	
	
	void withdraw(int amt) throws Exception {
		if(this.amt>amt) {
			this.amt-=amt;
			System.out.println("Successful,Remainig Balance"+this.amt);
			
            			
		}else {
			throw new BalanceException();
		}
	}
}





public class Main {
    public static void main(String[] args) {
		
    	Account account=new Account();
    	try {
    		account.withdraw(200000000);
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
}
