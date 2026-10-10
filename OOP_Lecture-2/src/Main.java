//import Model.Laptop;
//import Model.Building;
import Model.*;

public class Main { // You can have only one public class in a file
    // File name should be same as class name

    public static void main(String[] args){ // entry point of your program
        // If you do not define the ExceptionMain method, program will not execute
        // You will see the error, no such method

//        int arr[] = {2,3,4,5,6,2,4};
//
//        int sum = arraySum(arr);
//        System.out.println("Sum is "+sum);
//
//        int arr2[] = {4,5,7,8,90,34,23};
//        sum = arraySum(arr2);
//        System.out.println("Sum is "+sum);
//
//        int arr3[] = {4,5,7,8,90,34,23,34};
//        sum = arraySum(arr3);
//        System.out.println("Sum is "+sum);



        Student student = new Student(); // create one object or instance of student class
        student.name = "Robin";
        student.age = 23;


        Student student1 = new Student(); // Create one object or instance of student class
        student1.name = "Aakash";
        student1.age = 45;


      //  Student student2 = new Person(); not allowed

       // Person person = new Person();
      //  Laptop laptop = new Laptop();
       // laptop.name = "HP";

        Building building = new Building();




    }

    public static int arraySum(int arr[]){
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum = sum+arr[i];

        }
        return sum;
    }
}
