package javaDemos;

public class campoundassigment {
    public static void main(String[] args){
        byte a=10;
        // a=a+1;   then it will not work because the compiler consider it as a int for Arithmatic operationa nd then we are storing it in the byte a again then it is the error
        a+=1; // the jvm compiler internally do the casting like (byte)a+1; so this assignment do it implicitly
        System.out.println("a="+a);

        // other things
        System.out.println(7 / 2);
        System.out.println(7.0 / 2);
        System.out.println(7 / 2.0);

       // Character Arithmetic

        char c = 'A';
        System.out.println(c + 5);
        System.out.println((char)(c + 5));

       // Modulus with Negative Numbers

        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);



        //Prefix vs Postfix

        int x = 5;
        int y = x++ + ++x;

        System.out.println(x);
        System.out.println(y);
    }
}
