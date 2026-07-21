package collection;

import java.util.ArrayList;
import java.util.*;

public class IteratorDemo {



    public static void main(String[] args){
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        Iterator<Integer> it=ls.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
