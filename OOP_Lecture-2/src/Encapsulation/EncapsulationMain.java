package Encapsulation;

public class EncapsulationMain {

    public static void main(String[] args) {
        Student student = new Student();
        // direct access has been restricted
//        student.name = "Robin";
//        student.email = "robin@gmail.com";
//        student.age = 23;

        student.setName("Robin");
        student.setEmail("robin@gmail.com");
        student.setAge(-24);
        //student.age = -23;
        System.out.println("Name: "+student.getName());
        System.out.println("Email: "+student.getEmail());
        System.out.println("Age: "+student.getAge());

    }
}
