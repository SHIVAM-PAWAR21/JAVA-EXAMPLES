package pattern;

//      A
//    A B A
//  A B C B A
//A B C D C B A

public class AlphabetTriangle {
    public static void main(String[] args){
        pattern(6);
    }
    static void pattern(int n){
        int l=1;
        char replace='A';

        for(int i=1;i<=n*2;i+=2){
              char ch='A';

           for(int k=1;k<=n-l;k++){
               System.out.print("  ");
           }

            for(int j=1;j<=l;j++){
                System.out.print(ch++ +" ");

            }
            char center=replace;
            for(int m=2;m<=l;m++){

                center-=1;
                System.out.print(center +" ");
            }
            l++;
            replace++;

            System.out.println();

        }
    }
}
