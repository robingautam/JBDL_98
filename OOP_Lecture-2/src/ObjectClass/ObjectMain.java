package ObjectClass;

public class ObjectMain {

    public static void main(String[] args) {
        Person person = new Person(1,"Robin","robin@gmail.com");
        Person person2 = new Person(1,"Robin","robin@gmail.com");
        person.toString(); // toString method present inside the Object class,
        // This ObjectMain class by default extends the Object class so whatever methods present inside thus
        // Object class will ve available to the ObjectMain class


        // use of toString() method
        // Its a string representation of an object

       // System.out.println(person);
       // System.out.println(perso2);

        // Equal used to compare two objects

        System.out.println(person2.equals(person));

        System.out.println(person2.hashcode());

        System.out.println(person2);

    }
}
