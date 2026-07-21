package map;

import java.util.HashMap;
import java.util.*;

public class MapDemo {
    public static void main(String[] args){
        Map <Integer,Integer> map=new HashMap<>(Map.of( 1,100 , 2 ,200 ,3 ,300));

        System.out.println(map);
         map.remove(2);
        System.out.println(map);

        // only by using the Map.of
        //Exception in thread "main" java.lang.UnsupportedOperationException
        // it form the immutable map so the runtime error will come
        /*
        System.out.println("\n");
        Map <Integer,Integer> map11=Map.of( 1,100 , 2 ,200 ,3 ,300);

        System.out.println(map11);
        map11.remove(2);
        System.out.println(map);

         */

        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

        for(Integer i: map.keySet()){
            System.out.println(i);
        }

        Iterator<Integer> it=map.keySet().iterator();
        while(it.hasNext()){
            Integer key=it.next();
            System.out.println(key +"->"+ map.get(key));
        }
       System.out.println("use entryset");
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }




    }
}
