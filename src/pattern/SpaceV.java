package pattern;

//1          1
//12        21
//123      321
//1234    4321
//12345  54321
//123456654321

public class SpaceV {
    public static void main(String[] args){
        pattern(6);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=(n*2)-(i*2);k>=1;k--){

                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
