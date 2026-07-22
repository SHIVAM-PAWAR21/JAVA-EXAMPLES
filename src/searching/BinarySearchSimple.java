package searching;

public class BinarySearchSimple {

    public static int binarySearching(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={10,20,40,60,70,80,90};
        int target=8;
        int index=binarySearching(arr,target);
        if(index!=-1){
            System.out.println("the target element at index:"+index);
        }else{
            System.out.println("the target element is not found");
        }
    }
}
