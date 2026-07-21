package pattern;
//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * * 
//        *

public class DiamondPattern {
    public static void main(String[] args){
        show(9);
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
        for(int i=1;i<=n;i+=2){

            for(int j=1;j<i;j++) {
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
