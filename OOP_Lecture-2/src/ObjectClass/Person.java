package ObjectClass;

public class Person {

    int id;
    String name;
    String email;

    Person(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

//    public String toString() {
//        return "Name: "+this.name + ": Email: "+this.email;
//       // return "Robin";
//    }


    public boolean equals(Object obj){
        Person p1 = (Person) obj;
        return p1.name.equals(this.name) && p1.email.equals(this.email) && p1.id == this.id;
    }


    public int hashcode(){
        return 1234567890;
    }
}
