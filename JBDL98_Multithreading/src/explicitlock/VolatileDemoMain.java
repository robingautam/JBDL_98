package explicitlock;

public class VolatileDemoMain {

    public static void main(String[] args) throws InterruptedException {
        VolatileDemo volatileDemo = new VolatileDemo();

        Thread thread = new Thread(()->{
            System.out.println("starting the loop");
            while (volatileDemo.isRunning){
               // System.out.println("loop is running...");
            }
            System.out.println("value changed, loop ended, isRunning is false now");
        });

        thread.start();
//        try {
//            thread.join();
//        }
//        catch (Exception e){
//
//        }

        Thread.sleep(2000);

        volatileDemo.isRunning = false;

        System.out.println("main completed");
    }
}
