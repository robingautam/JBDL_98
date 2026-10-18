package producerconsumer;

public class Consumer extends Thread{

    SharedData sharedData;

    public Consumer(SharedData data){
        this.sharedData = data;
    }
    public void run(){
        for (int i=1;i<=10;i++){
            sharedData.consume();
        }
    }
}
