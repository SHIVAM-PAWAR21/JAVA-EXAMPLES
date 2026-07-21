package pattern;

//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class SameAlphabateRightAngleTriangle {
    public static void main(String[] args){
        pattern(6);
    }
    static void pattern(int n){
        char chars='A';
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                System.out.print(chars);
            }
              chars++;
            System.out.println();
        }
    }

}
