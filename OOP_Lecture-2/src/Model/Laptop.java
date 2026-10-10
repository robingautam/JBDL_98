package Model;

public class Laptop {
// this keyword is a reference variable for the object of Laptop class

    public Laptop(String name, String model, int price){
        this("Premium");
        this.name = name;
        this.model = model;
        this.price = price;

    } // constructor, no- argument constructor

    public Laptop(String brand){
        this.brand = brand;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    String name;// default
    public String model; // public
    private int price; // private
    protected String brand; // protected;


    public void printPrice(){
        System.out.println(price);
    }

    public int getPrice(){
        return price;
    }






}
