package Hash;

import java.util.HashSet;
import java.util.Set;

public class HashingMain {

    public static void main(String[] args) {
//         String s = "robin";
//         int hash = s.hashCode();
//         String s1 = "aakash";
//         int hash2 = s1.hashCode();
//        String s3 = "robin";
//        System.out.println(hash);
//        System.out.println(hash2);
//        System.out.println(s3.hashCode());


        Student student = new Student(1,"Robin",28,56);
        Student student2 = new Student(1,"Robin",28,56);

        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        Set<Student> set = new HashSet<>();
        set.add(student);
        set.add(student2);

        System.out.println(set.size()); // output is 2, because for hashset they are different object

        // how hashset decided whether the objects are same or not

        // hashset first check the hashcode, if the hashcode is different than objects are going to be different for the set
        // if the hashcode is same , then it will check the equals method
        // if the hashcode is same and equals return true then it's a same object for hashset








    }
}
