package runnable;

public class RunnableMain {

    public static void main(String[] args) {
        MyCustomThread runnable = new MyCustomThread();
        Thread thread = new Thread(runnable);
        thread.setName("My custom Thread-0");
        thread.start(); // we cannot create the thread without start
        try {
            thread.join();
        }
        catch (InterruptedException e){

        }

        System.out.println(thread.getName()); // Thread-1
        System.out.println(Thread.currentThread().getState()); // main
        System.out.println("main method");


    }
}
