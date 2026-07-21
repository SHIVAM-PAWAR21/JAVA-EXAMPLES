package pattern;
//12345
//1234
//123
//12
//1

public class ReverseNumberRightAngleTriangle {

    public static void main(String[] args){
        pattern(5);
    }

    static void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
