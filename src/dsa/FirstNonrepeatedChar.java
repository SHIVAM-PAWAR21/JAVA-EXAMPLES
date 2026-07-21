package dsa;

import java.util.*;

// M3. First Non-Repeating Character
//Return the **index** of the first character that appears exactly once. Return `-1` if none.
//
//- **Example:** `"leetcode"` → `0`; `"aabb"` → `-1`
//- **Constraints:** 1 ≤ length ≤ 10^5, lowercase letters.
//- **Tests:** frequency counting, `HashMap`/array of counts
//- **Signature:** `int firstUniqChar(String s)`
//- **Hint:** First pass: count every character. Second pass: return the index of the first character whose count is 1.
public class FirstNonrepeatedChar {
    int findfirstnonrepeatedchar(String str){

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        FirstNonrepeatedChar obj=new FirstNonrepeatedChar();
        String str="leetcode";
        System.out.println(obj.findfirstnonrepeatedchar(str));
        String str2="aabb";
        System.out.println(obj.findfirstnonrepeatedchar(str2));
    }
}
