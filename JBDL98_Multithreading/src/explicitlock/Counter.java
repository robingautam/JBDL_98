package explicitlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter {

    int count;

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    Lock readLock = readWriteLock.readLock();

    Lock writeLock = readWriteLock.writeLock();


    public void increment(int data){
        try {
            writeLock.lock();
            System.out.println(Thread.currentThread().getName() + " Setting the data");
            this.count = data;
        }
        finally {
            writeLock.unlock();
        }
    }

    public void getCount(){
        try {
            readLock.lock();
            System.out.println(Thread.currentThread().getName() + " Getting the data");
        }
        finally {
            readLock.unlock();
        }
    }
}
