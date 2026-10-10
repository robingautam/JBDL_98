package staticKeyword;

public class CollegeStudent {

    String name;
    String email;
    static String collegeName;

    CollegeStudent(){

    }

    public static void printData(){
        System.out.println(collegeName);
       // System.out.println(name);
       // System.out.println(email);  // we cannot use non static fields here


    }
}
