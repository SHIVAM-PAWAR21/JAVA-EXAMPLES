package dsa;

//M2. M2. Valid Palindrome
//Return `true` if a string is a palindrome, considering **only letters and digits**
//and ignoring case.
//
//- **Example:** `"A man, a plan, a canal: Panama"` → `true`; `"race a car"` → `false`
//- **Constraints:** string may be empty (empty = `true`).
//- **Tests:** strings, two-pointer technique
//- **Signature:** `boolean isPalindrome(String s)`
//- **Hint:** Two pointers, one from each end. Skip non-alphanumeric chars; compare lowercased. Move inward until they cross.

public class ValidPalindrome {
    boolean ispalindrome(String str1){

       int start=0;
       int end=str1.length()-1;
       while(start<end){
           if(str1.charAt(start)!=str1.charAt(end)){
               return false;
           }
           start++;
           end--;
       }
       return true;

    }
    public static void main(String[] args){
      String str="adcdan";
      ValidPalindrome obj=new ValidPalindrome();
      System.out.println(obj.ispalindrome(str));

    }
}
