package pattern;
//1
//22
//333
//4444
//55555

public class NumberRightAngleTriangleDemo2 {
    public static void main(String[] args){
        pattern(5);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
