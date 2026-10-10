package Collection.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(23);
        queue.add(45);
        queue.add(56);

//       Iterator<Integer> itr = queue.iterator();
//       while (itr.hasNext()){
//           System.out.println(itr.next());
//       }

//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll()); // after this queue is empty
//        System.out.println(queue.remove());

        // poll vs remove
        // remove - It throws the exception if queue is empty
        // poll - it returns null if the queue is empty

        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Student("Robin",10));
        priorityQueue.add(new Student("Aakash",15));
        priorityQueue.add(new Student("Preeti",8));

        System.out.println(priorityQueue.poll());

    }
}
