package ArraySimple;
//Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
// If the array is sorted then return True, Else return False.

public class CheckArrayIsSorted {
    static boolean ArrayIsSorted(int[] arr){

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr={10,20,30,40,80,100};

        if(ArrayIsSorted(arr)){
            System.out.println("the array is sorted:");
        }else{
            System.out.println("the array is not sorted:");

        }
    }
}
