package Collection.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(23);
        linkedList.add(45);

        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        linkedList.remove(1);
        System.out.println(linkedList.size());

        System.out.println( linkedList.get(0));



    }
}
