package ArraySimple;
//Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.


public class RotateArrayByKplace {
    void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    public int[] rotate(int[] arr,int k, String direction){

        int n=arr.length;

        if(n==0||k==0){
            return arr;
        }
        k=k%n;


        if(direction.equalsIgnoreCase("left")){

            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
            reverse(arr,0,n-1);


        }
        else if(direction.equalsIgnoreCase("right")){

            reverse(arr,0,n-1);
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
        }

        return arr;
    }

    public static void main(String[] args){

        RotateArrayByKplace obj=new RotateArrayByKplace();
        int[] arr={1,2,3,4,5,6};
        int[] arr2={10,20,30,40,50,60};

        obj.rotate(arr,2,"left");
        obj.rotate(arr2,2,"right");
        for (int num : arr) {
            System.out.print(num + " ");
        }
       System.out.println("\narr2:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
