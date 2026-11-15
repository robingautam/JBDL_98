package ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Jungle {

    @Autowired
    @Qualifier("cat")
    Animal animal;

    public Jungle(){}

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Jungle{" +
                "animal=" + animal +
                '}';
    }
}
