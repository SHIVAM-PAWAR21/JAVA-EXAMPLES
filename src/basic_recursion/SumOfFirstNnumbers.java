package basic_recursion;

public class SumOfFirstNnumbers {
    public static void main(String[] args){
        System.out.println(sum(10,0));
        System.out.println(sumof(10));
    }
    static int sum(int n,int sum){

        if(n<1){
            return sum;
        }
        sum = sum + n;

        return sum(n-1,sum);

    }
    // approach 2
    static int sumof(int n){
        if(n==1){
            return 1;
        }
        return n+sumof(n-1);
    }
}
