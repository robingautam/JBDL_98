package ExceptionHandling;

public class ThrowsExample {


    public void someMethod() throws Exception{
        System.out.println("this is the someMethid");
    }

    public static void main(String[] args) throws Exception{
        ThrowsExample obj = new ThrowsExample();
        obj.someMethod();

    }
}
