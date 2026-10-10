package Collection.Stack;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetMain {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        treeSet.add(23);
        treeSet.add(12);
        treeSet.add(100);
        treeSet.add(1);



        System.out.println(treeSet);
    }
}
