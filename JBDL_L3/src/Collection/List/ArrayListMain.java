package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListMain {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(23);
        arrayList.add(45);
        arrayList.add(50);
        arrayList.add(56);
        // Iteration
//        Iterator<Integer> itr = arrayList.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        // for loop
//        for (int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }


        // removal
//        arrayList.remove(2);
//        for (int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }

        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains(56));
      //  arrayList.clear();
        System.out.println(arrayList.size());

        List<Integer> child = new ArrayList<>();
        child.add(2);
        child.add(1);

        arrayList.addAll(child);

        System.out.println(arrayList.size());

        arrayList.set(0,90);


//        for (int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//       }


        System.out.println(arrayList);


        // fail fast iterator
//        Iterator<Integer> itr = arrayList.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//            arrayList.remove(arrayList.size()-1);
//        }

        // non fail fast iterator
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(10);
        copyOnWriteArrayList.add(20);

        Iterator<Integer> iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            copyOnWriteArrayList.remove(copyOnWriteArrayList.size()-1);
        }

        System.out.println(copyOnWriteArrayList.size());





    }
}
