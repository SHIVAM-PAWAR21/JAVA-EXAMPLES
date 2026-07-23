package ArraySimple;
//Given an array arr[] of size n-1 with distinct integers in the range of [1, n].
// This array represents a permutation of the integers from 1 to n with one element missing.
// Find the missing element in the array.
public class MissingNumber {
// using the actualsum and the expectedsum formaula
    int findMissingNumber(int[] arr){
        int n=arr.length+1;
        int expextedOutPut=n*(n+1)/2;
        int actualsum=0;

        for(int num:arr){
            actualsum+=num;
        }
        return expextedOutPut-actualsum;
    }

    //using the XOR
    int findMissingNumberUseXor(int[] arr){
        int n=arr.length+1;
        int xor1=0,xor2=0;

        for(int i=0;i<n-1;i++){
            xor1^=arr[i];
        }

        for(int i=1;i<=n;i++){
            xor2^=i;
        }
        return xor1^xor2;
    }

    public static void main(String[] args){
        MissingNumber obj=new MissingNumber();
        int missing =obj.findMissingNumber(new int[]{1,2,5,6,4,7});
        System.out.println("missing value is :"+missing);

        System.out.println("\nusing the xor:");
        System.out.println(obj.findMissingNumberUseXor(new int[]{1,2,5,6,4,7}));
    }
}
