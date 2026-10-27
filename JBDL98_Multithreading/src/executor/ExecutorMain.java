package executor;

import java.util.concurrent.*;

public class ExecutorMain {

    public static void main(String[] args) {

//      ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//      for (int i=1;i<=5;i++){
//          Runnable runnable = new Task();
//          executorService.submit(runnable);
//      }

        ExecutorService executorService = new ThreadPoolExecutor(2, 3, 2, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("Task is rejected");
            }
        });

        for (int i=1;i<=10;i++){
            int finalI = i;
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
            executorService.submit(()->{
                System.out.println("Task "+ finalI +" is executed by thread "+Thread.currentThread().getName());
            });

        }

        executorService.shutdown(); // it will not immediately shutdown the executor, it will wait other current threads to complete

      //  executorService.shutdownNow(); // immediately shutdown the executor (forcefully terminate the current executing threads)

        System.out.println("executor shutdown");


    }
}
