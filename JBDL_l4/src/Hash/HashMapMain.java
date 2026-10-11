package Hash;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapMain {

    public static void main(String[] args) {
//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(2,2);
//
//        System.out.println(map.get(0));

        Map<String,Integer> map = new HashMap<>();
        map.put("Robin",56);
        map.put("Aakash",34);
        map.putIfAbsent("Aakash",36);

        System.out.println(map.get("Robin"));
        System.out.println(map.getOrDefault("Aakash",0));


        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Robin",56);
        linkedHashMap.put("Aakash",34);

        for (String k: linkedHashMap.keySet()){
            System.out.println(linkedHashMap.get(k));
        }

        TreeMap<Integer,Integer> treeMap = new TreeMap<>(); // (Log N)
        treeMap.put(1,23);
        treeMap.put(34,23);
        treeMap.put(2,0);

        for (int key: treeMap.keySet()){
            System.out.println(key);
        }

    }
}
