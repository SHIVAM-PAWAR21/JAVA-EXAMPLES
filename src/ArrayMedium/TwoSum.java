package ArrayMedium;

import java.util.*;

//Problem Statement: Given an array of integers arr[] and an integer target.
//
//1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
//
//2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
public class TwoSum {

    // usinf the inner arrays the brute force approach

    String itHasTwoSumUseArrays(int[] arr,int sum){

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    return "yes";
                }
            }
        }
        return "no";
    }

    // using the hasmap
    String itHasTwoSumUseHasMap(int[] arr,int sum){

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff=sum-arr[i];

            if(map.containsKey(diff)){
                return "YES";
            }
            map.put(arr[i],i);
        }
        return  "No";
    }

    //using 2D array the optimal approach with time complexity o(N log N)
    String itHasTwoSumUseGridyTwosPointer (int[] arr,int sum){

        int n=arr.length;
        int[][] darray=new int[n][2];
        for(int i=0;i<arr.length;i++){
            darray[i][0]=arr[i];
            darray[i][1]=i;
        }

        Arrays.sort(darray,(a,b) ->Integer.compare(a[0],b[0]));


        /*for(int i=0;i<arr.length;i++){
            System.out.println(darray[i][0]+"->"+darray[i][1]);
          }*/


        int start =0,end=n-1;
        while (start<end){

            int actualSum=darray[start][0]+darray[end][0];

            if(actualSum==sum){
                return "Yes";
            }
            else if(actualSum<sum){
                start++;
            }
            else{
                end--;
            }
        }

        return "NO";
    }


    public static void main(String[] args){
    int[] arr1={2,6,5,8,11};
    int sum1=14;
    int[] arr2={2,6,5,8,11};
    int sum2=15;


    TwoSum obj=new TwoSum();
    System.out.println("\n  inner loop the brute force approach:"+obj.itHasTwoSumUseArrays(arr1,sum1));
        System.out.println("\n inner loop the brute force approach:"+obj.itHasTwoSumUseArrays(arr2,sum2));
        System.out.println("\n hashmap better approach:"+obj.itHasTwoSumUseHasMap(arr1,sum1));
        System.out.println("\n hashmap better approach:"+obj.itHasTwoSumUseHasMap(arr2,sum2));
        System.out.println("\n  2d array gridy optimal approach:"+obj.itHasTwoSumUseGridyTwosPointer(arr1,sum1));
        System.out.println("\n 2d array gridy optimal approach:"+obj.itHasTwoSumUseGridyTwosPointer(arr2,sum2));

    }
}
