package Polymorphism;

public class UPIPayment extends Payment {

    @Override
    public void makePayment(){
        System.out.println("Making the UPI payment");
    }
}
