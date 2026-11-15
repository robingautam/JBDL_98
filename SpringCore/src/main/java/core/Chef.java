package core;

public class Chef {

    String name;

    //Oven oven = new Oven(); // dependency, chef needed oven here to make the pizza

    Oven oven;

    public Chef(Oven oven){
        this.oven = oven;
    }

    public void makePizza(){
        oven.bake();
    }
}
