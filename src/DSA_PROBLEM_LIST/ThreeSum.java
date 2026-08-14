package DSA_PROBLEM_LIST;
import java.util.*;
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//Example 1:
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]

public class ThreeSum {

     List<List<Integer>> findThreeSum(int[] arr){

         List<List<Integer>> list=new ArrayList<>();
         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp= new ArrayList<>(List.of(arr[i],arr[j],arr[k]));
                        Collections.sort(temp);
                        if(!list.contains(temp)) {
                            list.add(temp);
                        }
                    }
                 }
             }
         }
       return list ;
     }

     Set<List<Integer>> findThreeSumUseSet(int[] arr){
         Set<List<Integer>> set=new HashSet<>();
         for(int i=0;i<arr.length;i++){
             Set<Integer> s1=new HashSet<>();
             for(int j=i+1;j<arr.length;j++){
                 int diff=-(arr[i]+arr[j]);
                 if(s1.contains(diff)){
                     List<Integer> subSet=new ArrayList<>(List.of(arr[i],arr[j],diff));
                     Collections.sort(subSet);
                     set.add(subSet);
                 }
                 s1.add(arr[j]);
             }
         }
         return set;
     }

     public static void main(String[] args){
         ThreeSum obj=new ThreeSum();
         int[] arr={-1,0,1,2,-1,-4};
         System.out.println(obj.findThreeSum(arr));

         System.out.println(obj.findThreeSumUseSet(arr));
     }
}
