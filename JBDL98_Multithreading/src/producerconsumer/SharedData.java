package producerconsumer;

public class SharedData {

    int data;

    boolean isProduced = false; // semaphore variable

    public  synchronized void produce(int data){
        if (isProduced){
            try {
                wait(); // stop the producer
            }
            catch (Exception e){

            }
        }
        this.data = data;
        isProduced = true;
        System.out.println("Produced: "+this.data);
        notify(); // to notify the consumer
    }

    public synchronized void consume(){
        if (isProduced==false){
            try {
                wait(); // stop the consumer thread
            }
            catch (Exception e){

            }
        }
        System.out.println("Consumed: "+this.data);
        isProduced = false;
        notify(); // notify to producer to produce next data

    }
}
