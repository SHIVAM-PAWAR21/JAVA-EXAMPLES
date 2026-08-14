package collection;
import java.util.*;
// USE THE HASHMAP AS THE SET

class MapAsSet{
    Map<Integer,String> map=new HashMap<>();

    void add(int no){
        map.put(no,"PRESENT");
    }

    boolean contains(int no){
        if(map.get(no)=="PRESENT"){
            return true;
        }
        return false;
    }

    void remove(int no){

       // map.keySet().removeIf(key->key==no);
      // map.remove(no);
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        


    }
    void removeAll() {
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

     void print(){
      for(Map.Entry<Integer,String> it:map.entrySet()){
          System.out.println(it.getKey()+"->"+it.getValue());
      }
     }

}
public class HashMapAsSet {
public static void main(String[] args){
 MapAsSet map1=new MapAsSet();

 map1.add(10);
 map1.add(10);
 map1.add(1);
 map1.add(20);
 System.out.println("set has:");
 map1.print();
 map1.remove(1);
    System.out.println("\nset has:");
    map1.print();

    System.out.println("it has element: "+map1.contains(20));
    System.out.println("it has element: "+map1.contains(2));

    System.out.println("remove all");
    map1.removeAll();
    map1.print();


}

}
