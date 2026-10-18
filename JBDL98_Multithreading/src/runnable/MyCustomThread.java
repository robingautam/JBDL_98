package runnable;

public class MyCustomThread extends Thread implements Runnable {


    @Override
    public void run() {
       for (int i=1;i<=10;i++){
//           try {
//               Thread.sleep(2000); // 2 sec
//           }
//           catch (InterruptedException e){
//
//           }
           try {
               this.join();
           }
           catch (Exception e){

           }
           System.out.println(i);
       }


    }
}
