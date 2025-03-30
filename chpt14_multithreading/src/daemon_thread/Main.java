package daemon_thread;

class DaemonThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread name:"+Thread.currentThread().getName());
		System.out.println("is daemon:"+Thread.currentThread().isDaemon());
	}
}


public class Main {
	public static void main(String[] args) {
		DaemonThread daemonThread=new DaemonThread();
		DaemonThread daemonThread2=new  DaemonThread();
		
		daemonThread.setDaemon(true);
		
		daemonThread2.start();
		daemonThread.start();
	}

}
