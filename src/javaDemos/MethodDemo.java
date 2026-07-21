package javaDemos;

public class MethodDemo {
    public static void main(String[] args){
        int a=2;
     System.out.println(a);
     System.out.println(show(a));
        System.out.println(a);
    }
   static int show(int a){
        System.out.println("show");
        return a+=10;
    }
}
