package basic_hashing;
//Problem Statement: Problem Statement: Given an array of size N.
// Find the highest and lowest frequency element.

import java.util.Map;
import java.util.HashMap;

public class HighLowFrequentElement {
    public static void main(String[] args){
    int[] arr=new int[]{10,20,20,20,30,30,30,10};
    HighLowFrequentElement obj=new HighLowFrequentElement();
    obj.highlowelements(arr);
    }
    void highlowelements(int[] arr){

        Map<Integer,Integer> map=new HashMap<>();

        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);

        }
        System.out.println(map);

        int maxfreq=Integer.MIN_VALUE ,maxele=0;
        int minfreq=Integer.MAX_VALUE ,minele=0;

        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            int key=it.getKey();
            int value=it.getValue();

            if(maxfreq<value){
                maxfreq=value;
                maxele=key;
            }
            if(minfreq>value){
                minfreq=value;
                minele=key;
            }
        }
        System.out.println("the max frequent element is :"+ maxele);
        System.out.println("the min frequent element is :"+ minele);
    }
}
