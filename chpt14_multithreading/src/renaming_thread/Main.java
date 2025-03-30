package renaming_thread;


class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is running:"+Thread.currentThread().getName());
	}
}

public class Main {
	
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		MyThread myThread2=new MyThread();
		
		System.out.println(myThread.getName());
		System.out.println(myThread2.getName());
		
		myThread.setName("Thread 1");
		myThread2.setName("Thread 2");
		
		myThread.start();
		myThread2.start();
		
	}

}
