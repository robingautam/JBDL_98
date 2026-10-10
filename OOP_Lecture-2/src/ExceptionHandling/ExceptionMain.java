package ExceptionHandling;

public class ExceptionMain {

    public static void main(String[] args) {
        System.out.println("Start of the program");
        try {
            // what you will write in try block
            // program which can throw the exception, possibility of exception
          //  int a = 10/0;

            // communicating with db
            // opening file, applying
        }
        catch(NullPointerException e){ // without try , you cannot write the catch block
            System.out.println("inside the catch block");
        }
        catch (ArithmeticException e){
            System.out.println("inside the arithemetic exception");
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("inside the finally block");
            // break the connection with db
            // close the file
        }

        System.out.println("End of the program");
    }
}
