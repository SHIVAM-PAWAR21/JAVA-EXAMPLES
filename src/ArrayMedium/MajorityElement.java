package ArrayMedium;

import java.util.HashMap;

//Problem Statement: Given an integer array nums of size n, return the majority element of the array.
//The majority element of an array is an element that appears more than n/2 times in the array.
// The array is guaranteed to have a majority element.
public class MajorityElement {

    // THE BRUTE FORCE APPROACH SO TIME O(N^2) SPACE O(1)
    static int findMajorityElementUseInnerArrays(int[] arr){
      int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int count=0;
           for(int j=i;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   count++;
               }
               if(count>(n/2)){
                   return arr[i];
               }
           }
        }
        return -1;
    }

    static int findMajorityElementUseHashMap(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(map.get(num)>(n/2)){
                return num;
            }
        }

        return  -1;
    }

    static int findMajorityElementUseVootingAlgo(int[] arr){
        int count=0;
        int element=0;

        for(int i=0;i<arr.length;i++){
          if(count==0){
              element=arr[i];
              count++;
          } else if(arr[i]== element){
              count++;
          } else{
              count--;
          }
        }

        int countFreq=0;
        for(int i=0;i<arr.length;i++){
            if(element==arr[i]){
                countFreq++;
            }
        }

        if(countFreq > (arr.length/2)){
            return element;
        }
        return -1;
    }

   public static void main(String[] args){
        int[] arr={7, 0, 0, 1, 7, 7, 2, 7,7};
        System.out.println("using the inner loop the brute force The majority element :" +findMajorityElementUseInnerArrays(arr));
       System.out.println("\n using the hashMap the better The majority element :" +findMajorityElementUseHashMap(arr));
       System.out.println("\n using the vooting algorithm the optimal The majority element :" +findMajorityElementUseVootingAlgo(arr));


   }
}
