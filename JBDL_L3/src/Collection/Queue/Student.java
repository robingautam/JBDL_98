package Collection.Queue;

public class Student implements Comparable<Student>{

    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        return o.marks - this.marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
