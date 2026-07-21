package javaDemos;

class show{
int a=10;
int b;
int data(int c){
    System.out.println(this);
    System.out.println(this.a);
    System.out.println(this);
    int d=a+b+c;
    return d;
}
}

public class Thisss {
    public static void main(String[] args){
        show demo=new show();
        demo.b=20;
        demo.data(10);
    }
}

