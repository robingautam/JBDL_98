public class Main {

    public static void main(String[] args) {

        Thread thread = new MyThread(); // created a one thread here
        thread.start(); // start will start the thread
        // can we start a thread again
      //  thread.start();

        Thread thread2 = new MyThread();
        thread2.start();
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}
