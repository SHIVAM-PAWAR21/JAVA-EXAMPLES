package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListValueRemove {
    public static void main(String[] args){
      List<Integer> list=new ArrayList<>(List.of(10,20,30,40,50));
      System.out.println("the list values "+list);

        /*for (Integer i : list) {
            list.remove(i);   // ❌ Runtime Error as ConcurrentModificationException
        }*/

       System.out.println("remove alll elements in the list");
        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            it.next();
            it.remove();
        }
       System.out.println("the final list"+list);

        System.out.println("the size of the list "+list.size());
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("using th remove all");

        List<Integer> ls1=new ArrayList<>(List.of(100,200,300,400));
        System.out.println(ls1);
        List<Integer> ls2=new ArrayList<>(List.of(10,20,300,400));
        System.out.println(ls2);

       /* ls1.removeAll(ls1);
        System.out.println("the list after removeall()"+ls1);
      */

       /*
        ls1.removeAll(ls2);
        System.out.println("the list after ls1. removeall( ls2)\n"+"list 1 ls1:"+ls1+"list 2 lis2:"+ls2);
        //the list after ls1. removeall( ls2)
        //list 1 ls1:[100, 200]list 2 lis2:[10, 20, 300, 400]
      */
        /*
        ls2.removeAll(ls1);
        System.out.println("the list after ls1. removeall( ls2)\n"+"list 1 ls1:"+ls1+"list 2 lis2:"+ls2);
        //the list after ls1. removeall( ls2)
        //list 1 ls1:[100, 200, 300, 400]list 2 lis2:[10, 20]
        */

        /*
        ls1.retainAll(ls2);
        System.out.println("the list after ls1. removeall( ls2)\n"+"list 1 ls1:"+ls1+"list 2 lis2:"+ls2);
         //the list after ls1. removeall( ls2)
        //list 1 ls1:[300, 400]list 2 lis2:[10, 20, 300, 400]
        */

        System.out.println(ls1);
        ls1.removeIf(n-> n%3==0);
        System.out.println(ls1);

    }
}
