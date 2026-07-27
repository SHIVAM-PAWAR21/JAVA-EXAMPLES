package ArrayMedium;

public class SortZerosOnesTwosArray {

//using the Brute force approach using the counts and while
    public void sortArray(int[] arr){
        int count0=0;
        int count1=0;
        int count2=0;

        for(int n:arr){
            if(n==0) {
                count0++;
            }
            else if(n==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int index=0;
        while (index<arr.length){
            if(count0>0) {
                arr[index++]=0;
                count0--;
            }
            else if(count1>0){
                arr[index++]=1;
                count1--;
            }
            else{
                arr[index++]=2;
                count2--;
            }
        }
        for(int n:arr){
            System.out.println(n);
        }

    }

    //the better approach  but the same things we do here also onlu the explanation is different
    //use for and two counter variables only beacuase of there is only 3 values

    public void sortArrayUseTwoCounters(int[] arr){
        int count0=0;
        int count1=0;


        for(int n:arr){
            if(n==0) {
                count0++;
            }
            else if(n==1){
                count1++;
            }
        }
       for(int i=0;i<count0;i++){
           arr[i]=0;
       }
       for(int i=count0;i<count0+count1;i++){
           arr[i]=1;
       }
       for(int i=count0+count1;i<arr.length;i++){
           arr[i]=2;
       }
        for(int n:arr){
            System.out.println(n);
        }

    }

    //use the swapping the optimal approach with complexcity is o(n) and space is 0(1) actually its same for above also

    void sortArrayUseSwap(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high){

            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
              int temp=arr[mid];
              arr[mid]=arr[high];
              arr[high]=temp;
              high--;
            }
        }
        for(int n:arr){
            System.out.println(n);
        }
    }

    public static void main(String[] args){
        int[] arr={1,0, 0, 2, 1,2,1, 0};
        SortZerosOnesTwosArray obj=new SortZerosOnesTwosArray();
        obj.sortArray(arr);
        System.out.println("\n use only 2 counter variables:");
        obj.sortArrayUseTwoCounters(arr);
        System.out.println("\n use swapping:");
        obj.sortArrayUseSwap(arr);
    }
}
