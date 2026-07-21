package inheritance;

class Parent{
    Parent(){
       System.out.println("this is parent ");
    }
}
public class Constractordemo extends Parent{
    Constractordemo(){
        System.out.println("this is child");
    }
    public static void main(String[] args){
        Constractordemo c1=new Constractordemo();

    }
}
