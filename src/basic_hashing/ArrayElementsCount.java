package basic_hashing;

import java.util.*;

public class ArrayElementsCount {
    public static void main(String[] args){
    int[] arr=new int[]{10,20,30,40,55,40,10,90,90};
    ArrayElementsCount obj=new ArrayElementsCount();
    obj.elementcount(arr);

    }

    void elementcount(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();

        for(int n: arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            System.out.println(it.getKey()+"-->"+it.getValue());
        }
    }
}
