package javaDemos;

class data{
    int a;
    int b;
    int c;
    void setDim(int x, int y){
        a=x;
        b=y;
    }
    public int show(){
        c=a+b;
        return c;
    }
}
public class Methods {
    public static void main(String[] args){
        data demo=new data();
        // one way to assign the values to the class variable using the object
       /* demo.a=10;
        demo.b=10;
        System.out.println(demo.c);
        System.out.print(demo.show());
*/
        demo.setDim(10,10);
        System.out.println(demo.c);
        System.out.print(demo.show());
    }
}
