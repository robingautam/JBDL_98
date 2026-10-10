package Model;

public class MainLaptop {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP","HP Notebook", 25000);
        Laptop laptop1 = new Laptop("DELL","Vostro",35000);
    //    laptop.price = 10000; // price is private, not able to access
     //   laptop.name = "HP";

        laptop.printPrice();
        laptop1.printPrice();


    }
}
