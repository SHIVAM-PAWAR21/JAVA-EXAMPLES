package ArrayMedium;

public class LongestSubArrayWithSumZero {
//Problem Statement: Given an array containing both positive and negative integers,
// we have to find the length of the longest subarray with the sum of all elements equal to zero.
    static int findSubArray(int[] arr){

        int length=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
               sum+=arr[j];

               if(sum==0){
                   length=Math.max(length,j-i+1);
               }
            }

        }
        return length;
    }

// it will not work for this because it contains negative so sliding window will not work
   /* static int findSubArrayUseTwosPointer(int[] arr){
        int start=0,end=0;
        int maxlen=0;
        int sum=arr[0];

        while(end<arr.length){

            if(start<=end && sum>0){
                sum-=arr[start];
                start++;
            }

            if(sum==0){
                maxlen=Math.max(maxlen,end-start+1);
            }
            end++;
            if(end<arr.length){
                sum+=arr[end];
            }
        }
        return maxlen;
    }  */

    public static void main(String[] args){
        int[] arr={9, -3, 3, -1, 6, -5};
        System.out.println("\nusing the for loops only the brute approach");
        System.out.println(findSubArray(arr));



       // System.out.println("\n using the two's pinter approach");
       // System.out.println(findSubArrayUseTwosPointer(arr));

    }
}
