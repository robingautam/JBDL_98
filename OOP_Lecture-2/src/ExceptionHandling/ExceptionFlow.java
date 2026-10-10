package ExceptionHandling;

public class ExceptionFlow {

    public static void main(String[] args) {
        try {
            int a = 10/0;
        }
        catch(NullPointerException n){
            System.out.println("e1");
        }
        catch(Exception e){
            System.out.println("e2");
        }
    }
}
