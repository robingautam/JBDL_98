package functions;

public class MyTaskMain {

    public static void main(String[] args) throws InterruptedException{
        Thread thread = new MyTask();
        thread.setDaemon(true);
        thread.start();


        Thread.sleep(2000);
      //  thread.interrupt(); // it will throw the interrupted exception

     //   System.out.println(thread.isAlive());


        System.out.println("main thread completed");

    }
}
