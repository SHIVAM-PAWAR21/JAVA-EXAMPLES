package pattern;
// the pyramid as per the star when we use n=9 the this type of look
//       *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *

public class ReversPyramidPatternDemo2 {

    public static void main(String[] args){

        show(12);
    }
    static void show(int n){
        for(int i=n;i>=1;i-=2){
           for(int j=i;j>1;j--){
               System.out.print(" ");
           }
            for(int k=i;k<=n;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//for(int i=n;i>=1;i-=2){
//            for(int k=i/2;k>=1;k--){
//                System.out.print("  ");
//            }
//
//            for(int j=n;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }