package ArraySimple;

//Problem Statement: You are given an array of integers,
// your task is to move all the zeros in the array to the end of the array
// and move non-negative integers to the front by maintaining their order.

public class MoveZeroToEnd {
    // using the override approach
    void moveToEnd(int[] arr){

        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        for(int no:arr){
            System.out.println(no);
        }

    }

    //USING THE SWAPING APPROACH

    void moveToEndUseSwap(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1){
            return;
        }


        for (int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                j++;
            }

        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


        public static void main(String[] args){

            int[] arr=new int[]{0,10,30,0,22,99,0};
            MoveZeroToEnd obj=new MoveZeroToEnd();
            obj.moveToEnd(new int[]{0,10,30,0,22,99,0});

            System.out.println("\nusing the swap method");
            obj.moveToEndUseSwap(new int[]{0,10,30,0,22,99,0});
        }



}
