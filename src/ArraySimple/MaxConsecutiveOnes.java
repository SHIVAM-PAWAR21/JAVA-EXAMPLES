package ArraySimple;

//Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array..
public class MaxConsecutiveOnes {
    int countMaxConsecutiveOnes(int[] arr){
        int count=0;
        int max=0;

        for(int n:arr){

            if(n==1){
                count+=1;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    }

    public static void main(String[] args){
        MaxConsecutiveOnes obj=new MaxConsecutiveOnes();
        int max=obj.countMaxConsecutiveOnes(new int[]{1,1,0,0,0,1,1,1,0,0,1,1,1,1});
        System.out.println("count of maximum consecutive ones: "+max);
    }
}

