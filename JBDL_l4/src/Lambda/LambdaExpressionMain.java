package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressionMain {

    public static void main(String[] args) {

        Predicate<Integer> predicate = i -> i%2==0; // lambda expression


        boolean ans = predicate.test(10);
      //  System.out.println(ans);


        List<Integer> list =  Arrays.asList(23,12,45,23);

        Comparator<Integer> comparator = ( o1,  o2) -> o1 - o2;

        list.sort(( o1,  o2) -> o2 - o1);

        System.out.println(list);
    }
}
