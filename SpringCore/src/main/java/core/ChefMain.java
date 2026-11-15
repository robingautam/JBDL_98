package core;

public class ChefMain {

    public static void main(String[] args) {
     //   Oven oven;// = this oven will be provided by the spring container
        Oven oven = new Oven();
        Chef chef = new Chef(oven);
        chef.makePizza();
    }
}
