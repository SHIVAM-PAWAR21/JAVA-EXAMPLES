package ArrayMedium;
//Problem Statement: Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
//A subarray is a contiguous non-empty sequence of elements within an array.
public class LargestSumSubArray {

    static int findLargestSumSubArrayUseInnerArrays(int[] arr){
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

    static int findLargestSumSubArrayUseKadaneAlgo(int[] arr){
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

        int[] arr={2, 3, 5, -2, 7, -4};
        System.out.println("use the inner Array to find the subarray longest sum : "+findLargestSumSubArrayUseInnerArrays(arr));
        System.out.println("use the kadane algoritham to find the subarray longest sum : "+findLargestSumSubArrayUseKadaneAlgo(arr));

    }

}
