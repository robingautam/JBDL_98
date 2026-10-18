package explicitlock;


public class CounterMain {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(()->{
           for (int i=0;i<=10;i++){
               counter.increment(i);
           }
        }, "Write-Thread");

        Thread t2 = new Thread(()->{
            for (int i=0;i<=10;i++){
                counter.getCount();
            }
        }, "Read 1-Thread");

        Thread t3 = new Thread(()->{
            for (int i=0;i<=10;i++){
                counter.getCount();
            }
        }, "Read 2-Thread");

        t1.start();
        t2.start();
        t3.start();
    }
}
