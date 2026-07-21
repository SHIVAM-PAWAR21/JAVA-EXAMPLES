package basic_recursion;

//print numbers from N to 1

public class ReversPrintNubers {
    public static void main(String[] args){
       show(5);
    }
    static void show(int n){
        if(n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        show(n-1);
    }
}
