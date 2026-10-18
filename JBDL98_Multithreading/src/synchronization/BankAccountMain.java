package synchronization;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Thread atm = new Thread(()->bankAccount.withdraw(700), "ATM");
        Thread nb = new Thread(()->bankAccount.withdraw(700), "NB");
        atm.start(); // st
        nb.start();
    }
}
