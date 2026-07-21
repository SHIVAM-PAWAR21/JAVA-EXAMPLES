package basic_recursion;

// print number from 1 to N

public class PrintNumbers {
    public static void main(String[] args){
        shownumbers(1,10);
    }
    public static void shownumbers(int current,int n){

        if(current>n){
            return;
        }
        System.out.println(current);

        shownumbers(current+1,n);


    }
}
