package Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Mathematics<Integer,Double,String,String> mathematics = new Mathematics();
       // mathematics.add(1,3.4);

        Mathematics<Double,Double,String,String> mathematics1 = new Mathematics<>();
        mathematics1.add(3.1,2.2);
        mathematics1.subtract("one","");


        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(12);
        int sum = 0;
        for (int i=0;i<list.size();i++){
            int num = list.get(i);
            sum = sum+num;
        }

        System.out.println(sum);


//        Maths<Object> maths = new Maths<>();
//        maths.num(23);

    }
}
