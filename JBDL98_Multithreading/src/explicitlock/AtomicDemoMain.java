package explicitlock;

public class AtomicDemoMain {

    public static void main(String[] args) throws InterruptedException {
        AtomicDemo atomicDemo = new AtomicDemo();
        Thread thread1 = new Thread(()->{
            for (int i=1;i<=1000;i++){
                atomicDemo.increment();
            }
        });

        Thread thread2 = new Thread(()->{
            for (int i=1;i<=1000;i++){
                atomicDemo.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final : "+atomicDemo.getData());
    }
}
