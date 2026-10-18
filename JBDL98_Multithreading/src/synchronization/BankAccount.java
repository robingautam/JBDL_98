package synchronization;

public class BankAccount {

    int balance = 1000;

    public  void withdraw(int amount){
        synchronized (BankAccount.class) {
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
        }
    }


    public synchronized static void anotherMethod(){

    }
}
