package dsa;
// Fibonacci with Memoization
//Return the n-th Fibonacci number efficiently for n up to 90 (use `long`).
//
//- **Example:** `n = 10` → `55`
//- **Constraints:** 0 ≤ n ≤ 90; naive recursion (O(2^n)) will be too slow — improve it.
//- **Tests:** recursion, memoization / dynamic programming
//- **Signature:** `long fib(int n)`
//- **Hint:** Cache results in an array or `HashMap` so each n is computed once (top-down), or build up iteratively from fib(0), fib(1) (bottom-up). O(n).

public class Fibonacci {
    public static void main(String[] args){
     int n=10;
     System.out.println(findfib(n));
    }
    static int findfib(int n){
        if(n<=1)
            return n;

        return findfib(n-1)+findfib(n-2);
    }
}
