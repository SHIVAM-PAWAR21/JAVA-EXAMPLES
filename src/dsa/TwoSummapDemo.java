package dsa;
import java.util.*;
//Given an array of integers `nums` and a target, return the **indices** of the two
//numbers that add up to the target. Assume exactly one solution; don't reuse an element.

public class TwoSummapDemo {

    int[] findtwosum(int[] arr,int target){
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(map.containsKey(diff)){
               return new int[]{i,map.get(diff)};

            }
            map.put(arr[i],i);
        }
      return new int[]{-1,-1};
    }

    public static void main(String[] args){
    int[] arr=new int[]{1,2,3,4,5,6,7};
    int target=11;
    TwoSummapDemo obj=new TwoSummapDemo();
    System.out.println(Arrays.toString(obj.findtwosum(arr,target)));
    }
}
