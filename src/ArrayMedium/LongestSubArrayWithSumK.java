package ArrayMedium;
//Problem Statement: Given an array nums of size n and an integer k,
// find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
public class LongestSubArrayWithSumK {
// using only the for loops that will calculate all sub array and compare it with k
   static int findSubArrayBrute(int[] arr,int k){
      int length =0;
      for(int i=0;i<arr.length;i++){
          int sum=0;
          for(int j=i;j<arr.length;j++){

              sum+=arr[j];

              if(sum==k){
                  length=Math.max(length,j-i+1);
              }
          }
      }
      return length;
    }

    // using the two's pointer approach
    // it will not work for the negative numbers

    static int findSubArrayTwosPointer(int[] arr,int k){

       int start=0;int end=0;

       int length=0;
      int sum=arr[0];

       while(end<arr.length){

           if(start<=end && sum>k){
               sum-=arr[start];
               start++;
           }

               if(sum==k){
                   length=Math.max(length,end-start+1);
               }
               end++;
               if(end<arr.length){
                   sum+=arr[end];
               }
       }
       return length;
    }

    public static void main(String[] args){
        int[] arr={10, 5, 2, 7, 1, 9};
        int[] arr2={-1,-1,-1,6, 3};
        int k=6;
        System.out.println("\n using the 2 for loops brute approach");
        System.out.println(findSubArrayBrute(arr2,k));
        System.out.println("\n using the two's pointer approach");
        System.out.println(findSubArrayTwosPointer(arr2,k));
    }
}
