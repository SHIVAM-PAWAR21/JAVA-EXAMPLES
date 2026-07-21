package basic_hashing;

import java.util.HashMap;
import java.util.Map;

public class TieHighLowFrequentElement {

    public static void main(String[] args){
     TieHighLowFrequentElement obj=new TieHighLowFrequentElement();
     int[] arr=new int[]{10,10,10,20,30,20,30,20,40,40};
     obj.highLowFrequency(arr);
    }
    void highLowFrequency(int[] arr){

         int maxFreq=Integer.MIN_VALUE;
         int minFreq=Integer.MAX_VALUE;
        Map<Integer,Integer> map=new HashMap<>();

        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> it: map.entrySet()){

            if(maxFreq<it.getValue()){
                maxFreq= it.getValue();
            }
            if(minFreq>it.getValue()){
                minFreq=it.getValue();
            }

        }
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if(it.getValue()==maxFreq){
                System.out.println(" most frequency element"+ it.getKey());
            }
            if(it.getValue()==minFreq){
                System.out.println("least frequency element"+it.getKey());
            }
        }

    }
}
