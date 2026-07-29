package ArrayMedium;
//Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
// Without altering the relative order of positive and negative elements,
// you must return an array of alternately positive and negative values.

import java.util.ArrayList;
import java.util.List;

public class RearrangeElementBySign {
    //brute force approach here we are using the two different arrays to store the positive and the negative numbers
    //then we will add it one by one
    void doSignElementZigZagUseTwoArrays(int[] arr){
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();

        for(int n:arr){
            if(n>0){
                pos.add(n);
            }else{
                neg.add(n);
            }
        }

        for(int i=0;i<arr.length/2;i++){
        arr[2*i]=pos.get(i);
        arr[2*i+1]=neg.get(i);

        }
        for(int num:arr){
            System.out.println(num);

        }

    }

    // using the optimal approach use one loop

    void doSignElementZigZagUseOneArray(int[] arr){
        int posIndex=0;
        int negIndex=1;
        int[] result=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                result[posIndex]=arr[i];
                posIndex+=2;
            }else{
               result[negIndex]=arr[i];
               negIndex+=2;
            }
        }
        for(int num:result){
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        RearrangeElementBySign obj=new RearrangeElementBySign();
        int[] arr={1,2,-3,-1,-2,3};
        System.out.println("\nbrute fore use two arrays seperatly: ");
        obj.doSignElementZigZagUseTwoArrays(arr);
        System.out.println("\n optimal use one array and one loop: ");
        obj.doSignElementZigZagUseOneArray(arr);
    }
}
