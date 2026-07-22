package ArraySimple;
//Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once.
// The relative order of the elements should be kept the same.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {

    // using the set that why it use the extra space for  it
    static int removeDuplicateUseSet(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                arr[index++]=arr[i];
            }
        }
        return index;
    }

    // using the two pointer it reduce the space complexity beacause not using extra space
    static int removeDuplicate(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                index++;
                arr[index]=arr[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args){


        int[] arr={1,10,20,20,30,40,40};

        int inx=removeDuplicateUseSet(arr);
        System.out.println("USING THE SET APPROACH");
        for(int i=0;i<inx;i++) {
            System.out.println(arr[i]);
        }
        System.out.println("USING THE TWO POINTER APPROACH");
        int index=removeDuplicate(arr);
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
}
