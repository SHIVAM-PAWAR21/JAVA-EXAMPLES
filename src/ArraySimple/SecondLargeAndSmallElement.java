package ArraySimple;
//Problem Statement: Given an array, find the second smallest and second largest element in the array.
// Print ‘-1’ in the event that either of them doesn’t exist.

import java.util.Arrays;

public class SecondLargeAndSmallElement {
    // using the sort method approach the brute
    static void findSecLargeNSmallElement(int[] arr){
        Arrays.sort(arr);
        System.out.println("the second large element:"+arr[arr.length-2]);
        System.out.println("the second small element:"+arr[1]);
    }


// using the variable approach optimal
    public static int findSecondLarge(int[] arr){
        int large=Integer.MIN_VALUE;
        int seclarge=Integer.MIN_VALUE;

        for(int n: arr){
            if(n>large){
                seclarge=large;
                large=n;
            }
            else if(n>seclarge && n!=large){
                seclarge=n;
            }
        }
        return seclarge;
    }

    public static int findSecondSmall(int[] arr){
        int small=Integer.MAX_VALUE;
        int secsmall=Integer.MAX_VALUE;

        for(int n: arr){
            if(n<small){
                secsmall=small;
                small=n;
            }
            else if(n<secsmall && n!=small){
                secsmall=n;
            }
        }
        return secsmall;
    }

    public static void main(String[] args){
        int[] arr={10,10,70,30,40,6,88,1};
        System.out.println("the second large value :"+findSecondLarge(arr));
        System.out.println("the second small value : "+findSecondSmall(arr));

        System.out.println("\n by using sort approach");
        findSecLargeNSmallElement(arr);
    }
}
