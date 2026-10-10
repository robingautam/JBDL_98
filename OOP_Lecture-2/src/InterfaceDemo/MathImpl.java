package InterfaceDemo;

public class MathImpl implements MathsOperation{


    @Override
    public void add(int a, int b) {
        System.out.println("sum is "+(a+b));
    }


    public void subtract(int a, int b){
        System.out.println("subtraction is "+(a-b));
    }
}
