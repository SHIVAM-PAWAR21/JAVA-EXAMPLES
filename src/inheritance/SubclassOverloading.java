package inheritance;

class Baseclass{
    void show(int a){
        System.out.println("no:"+a);
    }
}
class Childclass extends Baseclass{
    void show(int a,int b){
        System.out.println("no a:"+a+" b: "+b);
    }

}

public class SubclassOverloading  {
    public static void main(String[] args){
        Childclass obj=new Childclass();
        obj.show(10);
        obj.show(100,200);
    }

}
