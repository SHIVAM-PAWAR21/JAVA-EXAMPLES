package collection;
import java.util.*;
// USE THE ARRAY AS THE SET .
// in that set we are going to add 1 to 10
class AsSet{
    int[] arr;
    AsSet(){
         this.arr=new int[10];
    }
    void add(int n){
        arr[n-1]=n;
    }

    void remove(int n){
        arr[n-1]=0;
    }

    boolean contains(int no){
        if(no==arr[no-1]){
            return true;
        }
        return false;
    }

    void removeAll(){
        arr=new int[arr.length];
    }

    void print(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }

}




public class ArrayAsSet {
    public static void main(String[] args){
        AsSet set1=new AsSet();
        set1.add(2);
        set1.add(2);
        set1.add(3);
        set1.add(6);
        set1.add(9);
        set1.add(10);
        System.out.println("\n set has:");
        set1.print();

        set1.remove(2);
        System.out.println("\n set has:");
        set1.print();
        System.out.println("\n set has element :"+set1.contains(3));
        System.out.println("\n set has element :"+set1.contains(2));
        set1.removeAll();
        System.out.println("\n set has:");
        set1.print();

    }
}



