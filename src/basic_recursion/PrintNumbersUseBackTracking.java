package basic_recursion;

public class PrintNumbersUseBackTracking {
    public static void main(String[] args){
        shownumbers(1,6);
    }
    public static void shownumbers(int current,int n){

        if(current>n){
            return;
        }

        shownumbers(current+1,n);

        System.out.println(n-current+1);




    }
}
