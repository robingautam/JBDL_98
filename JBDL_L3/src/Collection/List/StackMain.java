package Collection.List;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        // stack - LIFO

        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(34);
        stack.push(45);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
       // System.out.println(stack.pop());

        // peek()
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());




    }
}
