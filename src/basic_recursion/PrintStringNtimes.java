package basic_recursion;

public class PrintStringNtimes {
    public static void main(String[] args){
        String str="shivam";
        prints(str,5);
    }
    public static void prints(String str,int n){

        if(n<1){
            return;
        }
        System.out.println(str);

        prints(str,n-1);
    }
}
