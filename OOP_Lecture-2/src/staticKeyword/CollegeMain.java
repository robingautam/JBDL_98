package staticKeyword;

public class CollegeMain {

    public static void main(String[] args) {
//        CollegeStudent collegeStudent = new CollegeStudent();
//        collegeStudent.name = "Robin";
//        collegeStudent.email = "robin@gmail.com";

        // we don't need to create any object to access the static fields
        CollegeStudent.collegeName = "MAIT";
        CollegeStudent.printData(); // static method accessed without any object

     //   System.out.println(collegeStudent.name + ", "+ collegeStudent.collegeName);
    }
}
