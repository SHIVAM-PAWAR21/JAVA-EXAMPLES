package javaDemos;

public class Ifelse {

    public static void main(String[] args){
        int a=10;
        int b=20;

        if(a==0){
            System.out.println(" a is  zero");
        }else if (b==0){
            System.out.println("b is zero");
        }else{
            System.out.println("not zero");
        }

        switch(a){
            case 1:
                System.out.println("is one ");
                break;
            case 2:
                System.out.println("is 2");
            default:
                System.out.println("no ones");
        }
    }
}
