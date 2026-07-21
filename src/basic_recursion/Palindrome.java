package basic_recursion;
//Problem Statement: Given a string, check if the string is palindrome or not.
// A string is said to be palindrome if the reverse of the string is the same as the string.
public class Palindrome {
    public static void main(String[] args){
        String str="abcdcba";
        String str2="shivvash";

        System.out.println(ispalindrome(0,str));
        System.out.println(ispalindrome(0,str2));
    }
    static boolean ispalindrome(int n,String str){

        if(n>str.length()/2) return true;

        if(str.charAt(n)!= str.charAt(str.length()-n-1))return false;

       return ispalindrome(n+1,str);
    }
}
