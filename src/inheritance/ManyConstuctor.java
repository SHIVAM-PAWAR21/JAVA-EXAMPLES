package inheritance;

class DemoCon{
    DemoCon(){
        System.out.println("no parameter");
    }
    DemoCon(int a){
        System.out.println("no:"+a);
    }

    DemoCon(int a,int b){
        System.out.println("nos:"+a+b);
    }
}


public class ManyConstuctor {
    public static void main(String[] args){
        DemoCon d1=new DemoCon(10,20);

    }
}
