package Inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Maruti";
        car.model = "800";

        System.out.println(car.name);
        System.out.println(car.model);

        SportsCar sportsCar = new SportsCar();
        sportsCar.name = "ferrari";
        sportsCar.model = "sedan";
        sportsCar.sunroof = "Sunroof is present";

        System.out.println(sportsCar.name);
        System.out.println(sportsCar.model);
        System.out.println(sportsCar.sunroof);
    }
}
