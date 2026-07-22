package Sorting;

import java.util.Arrays;

// selection sort
public class SelectionSort {
    public static void main(String[] args){
        int[] arr={30,50,10,20,80,30};
        SelectionSort obj=new SelectionSort();

        System.out.println("Before Selection Sort:");
        for(int n:arr){
            System.out.println(n);
        }
        obj.selctionSorting(arr);
    }
    void selctionSorting(int[] arr){

        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i;j<arr.length;j++){

                if(arr[j]<arr[min]){
                    min=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }

        System.out.println("After Selection Sort:");
        for(int n:arr){
            System.out.println(n);
        }

    }
}
