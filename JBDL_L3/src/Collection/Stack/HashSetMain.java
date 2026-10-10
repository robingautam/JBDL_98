package Collection.Stack;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(12);
        set.add(34);
        set.add(34); // duplicates are not allowed

        set.add(null);
        set.add(null);

        System.out.println(set);
    }
}
