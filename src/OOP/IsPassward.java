package OOP;

public class IsPassward {

    public static void main(String[] args){

        String Status="PENDING";
        if(Status.equals("PNDING")){
            System.out.println("same");
        }

         enum orderStatus{
           PLACED,
           CONFORMED,
           PENDING,
           DELEVERD,
           CANCELD
        }

        orderStatus state=orderStatus.CANCELD;

        if(state==orderStatus.CANCELD){
            System.out.println("canceld");
        }
    }
}
