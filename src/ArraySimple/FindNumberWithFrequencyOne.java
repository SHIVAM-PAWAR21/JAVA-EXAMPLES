package ArraySimple;

import java.util.HashMap;
import java.util.Map;

public class FindNumberWithFrequencyOne {

    // USING THE APPROACH OF THE ARRAYs two pointer

    int findNumberWithFrequencyOneUseArrays(int[] arr){

        for(int i=0;i<arr.length;i++){
            int count=0;
            int number=arr[i];

            for(int j=0;j<arr.length;j++){
                if(arr[j]==number){
                   count++;
                }
            }

            if(count==1)return number;
        }
        return -1;
    }

    // using hashmap
    int findNumberWithFrequencyOneUseHashMap(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:arr){
            if(map.get(n)==1){
                return n;
            }
        }
        return -1;
    }

    //use the optimal approach using xor

    int findNumberWithFrequencyOneUseXor(int[] arr){
        int xor=0;
        for(int n:arr){
            xor^=n;
        }
        return xor;
    }

    public static void main(String[] args){
        FindNumberWithFrequencyOne obj=new FindNumberWithFrequencyOne();
        int[] arr={2,3,4,4,2,1,3,1,5};

        System.out.println("\nusing arrays : "+obj.findNumberWithFrequencyOneUseArrays(arr));
        System.out.println("\nusing hashmap : "+obj.findNumberWithFrequencyOneUseHashMap(arr));
        System.out.println("\nusing Xor : "+obj.findNumberWithFrequencyOneUseXor(arr));


    }
}
