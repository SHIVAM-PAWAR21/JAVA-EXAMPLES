package inheritance;

class parent{
    int rollno=10;
    String name;

    void show(){
        System.out.println("i am the inheritance.parent ");
    }
}
 class Child extends parent{
    int rollno=20;

     void show(){

         System.out.println("this is the child");
    }
}

public class InheritanseDemo extends parent{
    public static void main(String[] args){
       Child c1=new Child();
       int y=c1.rollno;
       System.out.println(y);
       c1.show();
       System.out.println("\n");
       parent p1=new parent();
       y=p1.rollno;
       System.out.println(y);
       p1.show();
       // the runtime polymorphism "the dynamic dispatch" // overriding
        System.out.println("\n");
        parent p2=new Child();
        y=p2.rollno;
        System.out.println(y);
        p2.show();
    }

}
