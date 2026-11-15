package annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Chef {

    String name;

   // @Autowired
    Oven oven;

    /**
     * Rule of Autowiring on constructor
     *  1. If the single constructor is defined in the class, IOC or java will use that constructor to create the object and inject the dependency
     * 2. If more than one constructor is present, then java will check for the default constructor or no-arg constructor
     * 3. If single constructor is defined, then we don't need to use @Autowired annotation
     * 4. If we have more than one constructor, one is annotated with @Autowired annotation, java will prefer this constructor
     * **/
    @Autowired
    public Chef(Oven oven){
        this.oven = oven;
        System.out.println("Oven constructor");
    }

    public Chef(String name){
        this.name = name;
        System.out.println("Name constructor");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Oven getOven() {
        return oven;
    }

   // @Autowired(required = false)
   // @Autowired
    public void setOven(Oven oven) {
        this.oven = oven;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", oven=" + oven +
                '}';
    }
}
