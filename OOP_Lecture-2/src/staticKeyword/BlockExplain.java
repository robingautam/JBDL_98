package staticKeyword;

public class BlockExplain {

    static String name;

    static {
        // static initialization block
        name = "Robin";
        System.out.println("Inside the static block");
        // this static block will execute before the ExceptionMain method
        // static block executed during the class loading
    }

    public static void main(String[] args){
        System.out.println("Inside the ExceptionMain method");

    }
}
