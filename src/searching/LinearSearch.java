package searching;

public class LinearSearch {
    public int search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        LinearSearch obj=new LinearSearch();
        int[] arr={10,30,20,100,40,60};
        int target=20;
        int index = obj.search(arr, target);

        if(index != -1){
            System.out.println("Target element found at index: " + index);
        } else {
            System.out.println("Target element is not present in the array.");
        }
    }
}
