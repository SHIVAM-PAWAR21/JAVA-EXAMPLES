package pattern;
//1
//01
//101
//0101
//10101
//010101

public class ZeroOneRightAngleTriangleDemo2 {
    public static void main(String[] args){
        pattern(6);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            int k;
            if(i%2==0){
                k=0;
            }
            else{
                k=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k=1-k;
            }
            System.out.println();
        }
    }
}
