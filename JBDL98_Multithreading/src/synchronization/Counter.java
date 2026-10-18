package synchronization;

public class Counter {

    int count;

    public synchronized void increment(){
        this.count++;
    }

    public int getCount(){
        return count;
    }
}
