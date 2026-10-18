package explicitlock;

import synchronization.BankAccount;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    int balance = 1000;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        try {
            lock.lock(); // it will acquire the lock
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " going to withdraw the amount");
                try {
                    Thread.sleep(1000); // simulation for db operation
                } catch (Exception e) {

                }
                balance = balance - amount;
                System.out.println(Thread.currentThread().getName() + " Withdrawn amount, Balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
            }
        }
        finally {
            lock.unlock(); // release the lock
        }

    }


    public void withdrawTryLock(int amount){
        try {
           if (lock.tryLock()) {
               if (balance >= amount) {
                   System.out.println(Thread.currentThread().getName() + " going to withdraw the amount");
                   try {
                       Thread.sleep(10000); // simulation for db operation
                   } catch (Exception e) {

                   }
                   balance = balance - amount;
                   System.out.println(Thread.currentThread().getName() + " Withdrawn amount, Balance: " + balance);
               } else {
                   System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
               }
           }else {
               System.out.println(Thread.currentThread().getName()+" Resource is not free");
           }
        }
        finally {
            lock.unlock(); // release the lock
        }
    }


}
