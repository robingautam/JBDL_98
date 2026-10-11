package Streams;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMain {

    public static void main(String[] args) {
//        Stream<Integer> stream = Stream.of(1,2,456,23,45,12,2,3,56);
//
//        List<Integer> list = stream.toList();
//
//        System.out.println(list);


        List<Integer> list = Arrays.asList(23,12,45,67,23,12,89);

        // you have to find all the even numbers from the list

//        List<Integer> even = new ArrayList<>();
//        for (int i=0;i<list.size();i++){
//            int num = list.get(i);
//            if (num%2==0){
//                even.add(num);
//            }
//
//        }
//
//        System.out.println(even);


        // 1. task is to find the even numbers
        List<Integer> evenList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        // 2. Do the square of all odd numbers

        List<Integer> oddList = list.stream().filter(i->i%2==1).map(i -> i*i).collect(Collectors.toList());
        System.out.println(oddList);

        List<Integer> sortedData = list.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedData);

        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());

        System.out.println(distinct);

        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
        List<Integer> flat = nested.stream()
                .flatMap(List::stream) // merge all inner lists
                .collect(Collectors.toList());
        System.out.println(flat);

       List<Integer> skip = list.stream().skip(2).filter(i->i%2==0).collect(Collectors.toList());

        System.out.println(skip);

        // terminal operations

       int max = list.stream().max((i1,i2)->i2-i1).get();
        System.out.println(max);

       int min = list.stream().min((i1,i2)->i2-i1).get();
        System.out.println(min);

       boolean anyMatch = list.stream().anyMatch(i->i==100);

        System.out.println(anyMatch);

        boolean allMatch = list.stream().allMatch(i->i%2==0);
        System.out.println(allMatch);



    }
}
