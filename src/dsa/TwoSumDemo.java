package dsa;

import java.util.Arrays;

public class TwoSumDemo {
    int[] findtwosum(int[] arr,int target) {
        for(int no=0;no<arr.length;no++){
            int diff=target-arr[no];
            for(int i=0;i<arr.length;i++){
                if (diff == arr[i]) {
                    return new int[]{no , i };
                }
            }
        }
        return new int[]{-1, -1} ;
    }
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5,6,7};
        int target=11;
        TwoSumDemo obj=new TwoSumDemo();
        System.out.println(Arrays.toString(obj.findtwosum(arr,target)));


    }
}
