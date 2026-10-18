package explicitlock;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();

//        Thread atm = new Thread(()->account.withdraw(700),"ATM");
//        Thread nb = new Thread(()->account.withdraw(700),"NB");
//
//        atm.start();
//        nb.start();

        Thread atm = new Thread(()->account.withdrawTryLock(700),"ATM");
        Thread nb = new Thread(()->account.withdrawTryLock(700),"NB");

        atm.start();
        nb.start();
    }
}
