package Hash;

public class Student {

    int rollNo;
    String name;
    int age;
    int marks;

    public Student(){

    }

    public Student(int rollNo, String name, int age, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object obj){
        Student that = (Student) obj;
        if (this.rollNo==that.rollNo && this.name.equals(that.name)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return this.rollNo + this.name.hashCode();
    }
}
