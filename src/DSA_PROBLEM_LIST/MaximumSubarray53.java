package DSA_PROBLEM_LIST;
import java.util.*;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.

public class MaximumSubarray53 {

    int findMaxSubArray(int[] arr){
      int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }

  int findMaxSumUseK(int[] arr){
      int maxSum=Integer.MIN_VALUE;
      int sum=0;
      for(int i=0;i<arr.length;i++){
          sum+=arr[i];
          if(maxSum<sum){
              maxSum=sum;
          }
          if(sum<0){
              sum=0;
          }
      }
      return maxSum;
  }

  public static void main(String[] args){
      MaximumSubarray53 obj=new MaximumSubarray53();
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("THE MAX SUM OF SUBARRAY IS :"+obj.findMaxSubArray(arr));
      System.out.println("THE MAX SUM OF SUBARRAY IS :"+obj.findMaxSumUseK(arr));
  }
}
