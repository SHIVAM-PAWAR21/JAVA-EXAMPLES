package basic_recursion;

//fibo(n-1);
//
public class Fibonacci {
    public static void main(String[] args){
        int n=10;
        System.out.println("for printing the fibonacci series until N index");
        for(int i=0;i<=n;i++){
            System.out.println(fibo(i));
        }
        System.out.println("\n\n\n");
        System.out.println("fidonacci value at index n:"+fibo(5));
        printfibonacci(5);
    }
    static int fibo(int n){
        if(n<=1) {
            return n;
        }


        return fibo(n-1)+fibo(n-2);
    }

    static int printfibonacci(int n){

        if(n<=1) {
            return 1;
        }

        int  last=printfibonacci(n-1);
         int seclast=printfibonacci(n-2);

            System.out.println("for the number " + n);
            System.out.println(seclast);
            System.out.println(last);

        return last+seclast;
    }
}
