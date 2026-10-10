package Polymorphism;


public class Main {
    public static void main(String[] args) {
        Math math = new Math();
        int res = math.add(2,3);
       // math.add(3.4,2);
    //    System.out.println(res);


        Person person = new Father();
        person.responsibility();

        Person person1 = new Mother();
        person1.responsibility();


        Payment payment = new UPIPayment(); // this thing
        payment.makePayment();




    }
}
