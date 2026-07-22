package ArraySimple;

import java.util.Arrays;

public class LargeElement {

//USING THE SORT METHOD APPROACH
    int findMaxElementUseSort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];

    }
// USNIG THE MAX VARIABLE APPROACH
    int findMaxElementUseMaxVariable(int[] arr){

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }





    public static void main(String[] args){
        LargeElement obj=new LargeElement();
        int[] arr={30,10,60,60,39,61,33};

        System.out.println("using the sort approach:");
        int maxBru=obj.findMaxElementUseSort(arr);
        System.out.println("The max element in array is :" +maxBru);
        System.out.println("\n using the max variable approach:");
        int maxopt=obj.findMaxElementUseMaxVariable(arr);
        System.out.println("The max element in array is :" +maxopt);

    }
}
