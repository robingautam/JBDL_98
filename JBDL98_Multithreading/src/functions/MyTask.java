package functions;

public class MyTask extends Thread{

    @Override
    public void run() {
        System.out.println("Sleeping mode started");
        try {
            Thread.sleep(10000);
            System.out.println("Sleeping mode done successfully without interruption");
        }
        catch (InterruptedException e){
            System.out.println("Interrupted called");
        }
    }
}
