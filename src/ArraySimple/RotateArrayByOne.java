package ArraySimple;
//Problem Statement: Given an integer array nums, rotate the array to the left by one.

public class RotateArrayByOne {
    static void leftRotateByOne(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }

    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60};
        System.out.println("BEFORE ROTATE BY ONE:");
        for(int n:arr){
            System.out.println(n);
        }
          leftRotateByOne(arr);
        System.out.println("AFTER ROTATE BY ONE:");
        for(int n:arr){
            System.out.println(n);
        }
    }
}
