package javaDemos;

import java.util.Scanner;

public class StringDemo {
public static void main(String[] args){
Scanner sc= new Scanner(System.in);


/*String javaDemos.data=sc.next();
System.out.println(javaDemos.data);
String dtat1=sc.nextLine();
System.out.println(dtat1);*/
    String str="hello";
    System.out.println(str);

    str="new";
    System.out.println(str);

    StringBuilder demo=new StringBuilder("java");
    demo.delete(2,3);
    System.out.println(demo);
    demo.insert(2,"v");
    System.out.println(demo);

    demo=new StringBuilder("show");
    System.out.println(demo);
    String s=demo.toString();
    System.out.println(s);
    s=s+"aa";
    System.out.println(s);

    String ss=new String("shivam");
    System.out.println(ss);
    String sss= ss.intern();
    System.out.println(sss);


}
}
