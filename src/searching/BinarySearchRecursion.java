package searching;

public class BinarySearchRecursion {

    public static int binarySearch(int[] arr,int start ,int end,int target){
        if(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                return binarySearch(arr,start,mid-1,target);
            }else{
                return  binarySearch(arr,mid+1,end,target);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={10,20,40,60,70,80,90};
        int target=80;
        int index=binarySearch(arr,0,arr.length-1,target);
        if(index!=-1){
            System.out.println("the target element at index:"+index);
        }else{
            System.out.println("the target element is not found");
        }
    }
}
