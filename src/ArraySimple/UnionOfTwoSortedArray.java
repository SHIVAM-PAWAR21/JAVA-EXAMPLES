package ArraySimple;

//Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

import java.util.*;

public class UnionOfTwoSortedArray {
// THE OPTIMAL APPROACH USING THE TWOS POINTER
    void unionOfarrays(int[] arr1, int[] arr2) {
        int x = 0;
        int y = 0;
        List<Integer> ls = new ArrayList<>();

        while (x < arr1.length && y < arr2.length) {

            if (arr1[x] < arr2[y]) {
                if (ls.isEmpty() || ls.getLast() != arr1[x]) {
                    ls.add(arr1[x]);
                }
                    x++;

            } else if (arr1[x] > arr2[y]) {
                if (ls.isEmpty() || ls.getLast() != arr2[y]) {  // in place of the ls.getLast() we can use the ls.get(Size()-1)  because the getlast only work in java 21+ versions
                    ls.add(arr2[y]);
                }
                    y++;

            } else {
                if (ls.isEmpty() || ls.getLast() != arr2[y]) {
                    ls.add(arr2[y]);
                }
                    y++;
                    x++;

            }
        }

        while (x < arr1.length) {
            if (ls.isEmpty() || ls.getLast() != arr1[x]) {
                ls.add(arr1[x]);
            }
                x++;

        }
        while ((y < arr2.length)) {
            if (ls.isEmpty() || ls.getLast() != arr2[y]) {
                ls.add(arr2[y]);
            }
                y++;

        }

        System.out.println("the union of two sorted array");
        for(int num:ls){
            System.out.println(num);
        }
    }


    //USING THE SET APPROACH
    void unionOfArrayUseSet(int[] arr1,int[] arr2){

        SortedSet<Integer> set=new TreeSet<>();

        for(int n:arr1){
            set.add(n);
        }
        for(int n:arr2){
            set.add(n);
        }

        System.out.println("the union of two sorted array");
        for(int num:set){
            System.out.println(num);
        }


    }

    public static void main(String[] args){
        UnionOfTwoSortedArray onj=new UnionOfTwoSortedArray();

        System.out.println("USING TWO'S POINTER");
        int[] arr1={1,2,3,4,5,6,6};
        int[] arr2={1,2,3,4,5,6,7,7,8,100};
        onj.unionOfarrays(arr1,arr2);

        System.out.println("USING THE SET");
        onj.unionOfArrayUseSet(arr1,arr2);
    }
}
