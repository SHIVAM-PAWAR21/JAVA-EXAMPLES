package inheritance;

class Base{
    void show(){
        System.out.println("parent");
    }
}
class ChildDemo extends Base{
    @Override
    void show() {
        // first call the base class show then call its show  so o/p-parent childemoclassssss
        super.show();
        System.out.println("childdemoclasssssss");
    }
}
public class SuperMethod extends ChildDemo{
    void show(){

        System.out.println("child");
        super.show();

    }

    public static void main(String[] args){
        SuperMethod st=new SuperMethod();
        st.show();


    }


}
