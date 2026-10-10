package ExceptionHandling;

import ExceptionHandling.customeException.AgeNotValidException;

public class CustomThrow {

    public static void main(String[] args) {
//        System.out.println("start of the program");
//       int a = 10;
//       int b = 0;
//
//       if (b<=0){
//           throw new ArithmeticException();
//       }
//       int c = a/b;
//        System.out.println("end of the program");

        System.out.println("start of the program");

        try {
            int age = 15;
            if (age<18){
                throw new AgeNotValidException("Minimum age should be 18");
            }
        }
        catch (Exception e){
            System.out.println("Inside the exception block");
            System.out.println(e.getMessage());
        }

        System.out.println("End of the program");

    }
}
