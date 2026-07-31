package ArrayMedium;
//last element of array is always leader and the array element is is leader if its all right elements are smaller than it.
import java.util.*;
public class LeadersInArray {

// its the Brute force we are using the inner loop so the complexity time-O(n^2)  space-O(N)-arraylst used
    List<Integer> findLeaders(int[] arr){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
           boolean isLeader=true;
           for (int j=i+1;j<arr.length;j++){

               if(arr[i]<arr[j]){
                   isLeader=false;
               }
           }
           if(isLeader){
               list.add(arr[i]);
           }
        }
        return list;
    }

    // the optimal approach where we are going to use one loop only
    List<Integer> findLeadersUseOneLoop(int[] arr){

        List<Integer> list=new ArrayList<>();
        if (arr.length == 0) {
            return list;
        }
        int max=arr[arr.length-1];
        list.add(max);

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }

        }

        Collections.reverse(list);
        return list;
       // we can use it "" return list.reversed();""
    }

    public static void main(String[] args){
        LeadersInArray obj=new LeadersInArray();
        int[] arr={4, 7, 1, 0};
        System.out.println("the Leaders : "+obj.findLeaders(arr));
        System.out.println("\n using the only one loop backword");
        System.out.println("the Leaders : "+obj.findLeadersUseOneLoop(arr));


    }
}
