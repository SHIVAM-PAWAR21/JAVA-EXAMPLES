package pattern;

//*****
//*   *
//*   *
//*   *
//*****

public class HollowSquare {

    public static void main(String[] args){
        pattern(5);
    }
    public static void pattern(int n){


        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){

                if(i==1 || i==n || j==1 || j==n){
                   System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // SECOND APPROCH

       //  for(int i=1;i<=n;i++){
        //
        //            for(int j=1;j<=n;j++){
        //                if(i==1 || i==n || j==1 ){
        //                    System.out.print("*");
        //                }
        //            }
        //            for(int k=2;k<=n-1;k++){
        //                if(i!=1 && i!=n){
        //                    System.out.print(" ");
        //                }
        //
        //            }
        //            for(int l=n;l<=n;l++){
        //                    if(i!=1 && i!=n) {
        //                        System.out.print("*");
        //                    }
        //
        //            }
        //            System.out.println();
        //        }
    }
}
