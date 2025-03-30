package sleep;


class MyThread extends Thread{
	private String threadName;

    public MyThread(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
    	System.out.println(threadName+"is sleeping");
    	try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
    	
    	System.out.println(threadName+"has woke up");
    }
    
    
}

public class Main {
  public static void main(String[] args) {
	MyThread myThread=new MyThread("Thread1");
	MyThread myThread2=new MyThread("Thread2");
	
	myThread.start();
	myThread2.start();
}
}
