package javaDemos;

public class Staticmethod {
    public static void show(){
        System.out.println("this is the inheritance.parent  class");
    }
}
class Demo extends Staticmethod{
    public static void show(){
        System.out.println("this is the child class");
    }
    public static void main(String[] args){
        Demo d =new Demo();
        d.show();
        Staticmethod d1=new Staticmethod();
        d1.show();

        Staticmethod d2 = new Demo();
        d2.show();
    }
}