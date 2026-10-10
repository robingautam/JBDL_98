package Collection.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueMain {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(3);
        queue.add(23);
        queue.add(25);
        queue.add(1);

        queue.add(456);



    }
}
