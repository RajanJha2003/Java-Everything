package thread_priority;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { 
            System.out.println("Running " + Thread.currentThread().getName() + 
                               " with priority " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("Low Priority Thread");
        MyThread myThread2 = new MyThread("High Priority Thread");

        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread2.setPriority(Thread.MAX_PRIORITY);

        myThread.start();
        myThread2.start();
    }
}
