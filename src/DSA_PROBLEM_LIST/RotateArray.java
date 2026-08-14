package DSA_PROBLEM_LIST;
import java.util.*;
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
//Example 1:
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
public class RotateArray {

    void reverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }

    int[] rotateArray(int[] arr,int k){
        int n=arr.length;
         k=k%n;

        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        reverseArray(arr,0,n-1);

      return arr;
    }

    public static void main(String[] args){
        RotateArray obj=new RotateArray();
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        System.out.print("\n BEFORE ROTATE:");
        for(int n:arr){
            System.out.print(" "+n+" ");
        }
        obj.rotateArray(arr,k);
        System.out.print("\n AFTER ROTATE:");

        for(int n:arr){
            System.out.print(" "+n+" ");
        }

    }
}
