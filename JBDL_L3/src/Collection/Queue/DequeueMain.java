package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(23);
        deque.add(45);
        deque.add(56);

        System.out.println(deque.removeLast());
        System.out.println(deque.remove());
        deque.addFirst(92);
      //  System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());


    }
}
