package dsa;
//M4. Move Zeroes
//Move all `0`s in an array to the end **while keeping the order** of non-zero elements.
//Do it **in place** (no new array).
//
//- **Example:** `[0,1,0,3,12]` → `[1,3,12,0,0]`
//- **Constraints:** modify the array directly; minimize writes.
//- **Tests:** in-place array manipulation, two pointers
//- **Signature:** `void moveZeroes(int[] nums)`
//- **Hint:** Keep an "insert position" pointer. Walk the array; each time you see a non-zero, write it at the insert position and advance it. Fill the rest with zeros.

public class MovezeroToend {
    public static void main(String[] args){
       // int[] arr=new int[]{0,10,30,0,22,99,0};
        //MovezeroToend obj=new MovezeroToend();
        //obj.movetoend(arr);

        int[] arr=new int[]{0,10,30,0,22,99,0};
        MovezeroToend obj=new MovezeroToend();
        obj.movetoend(new int[]{0,10,30,0,22,99,0});
    }
     void movetoend(int[] arr){

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
}
