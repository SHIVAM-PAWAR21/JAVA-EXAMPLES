package pattern;

//*                 *
//* *             * *
//* * *         * * *
//* * * *     * * * *
//* * * * * * * * * *
//* * * *     * * * *
//* * *         * * *
//* *             * *
//*                 *

public class Butterfly {
    public static void main(String[] args){
        pattern(5);
    }
    static void pattern(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=(n*2)-(i*2);k>=1;k--){

                System.out.print("  ");
            }
            for(int l=i;l>=1;l--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=2;i<=n;i++){

            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }

            for(int k=2;k<=i;k+=1){
                System.out.print("    ");
            }


            for(int m=i;m<=n;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
