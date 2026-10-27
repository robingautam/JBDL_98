package executor;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("My task is getting executed by thread: "+Thread.currentThread().getName());
    }
}
