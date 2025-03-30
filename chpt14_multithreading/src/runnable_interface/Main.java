package runnable_interface;



class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}

	
	
}

public class Main {
  public static void main(String[] args) {
	  MyThread myThread=new MyThread();
	  Thread thread=new Thread(myThread);
	  thread.start();
	
}
}
