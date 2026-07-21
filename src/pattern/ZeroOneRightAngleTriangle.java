package pattern;

public class ZeroOneRightAngleTriangle {

    public static void main(String[] args){
        pattern(6);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){

                for (int j = 1; j <=i; j++) {
                    if(j%2!=0) {
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();

        }
    }
}


//  for(int i=1;i<=n;i++){
//      int k;
//      if(i%2==o){
//        k=0;
 //       }
//        else{
////            k=1
////        }
//                for (int j = 1; j < i; j++) {
//                   System.out.println(k);
//                     k=1-k;
//                }
//                System.out.println();
//
//        }