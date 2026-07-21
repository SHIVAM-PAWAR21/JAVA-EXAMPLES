package javaDemos;

public class Bitwisedemo {
    public static void main(String[] args){
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toBinaryString(57));
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toBinaryString(255));


        // the cycle of signed intergers  like 0,1,....126,127,-128,-127,....-2,-1
        byte b = 127;
        b++;

        System.out.println(b);

        int x = Integer.MAX_VALUE;
        System.out.println(x);
        x++;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x <<= 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }
}
