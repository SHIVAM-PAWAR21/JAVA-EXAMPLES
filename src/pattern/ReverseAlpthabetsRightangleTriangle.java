package pattern;

//ABCDEF
//ABCDE
//ABCD
//ABC
//AB
//A

public class ReverseAlpthabetsRightangleTriangle {

    public static void main(String[] args){
        pattern(6);
    }

    static void pattern(int n){
        for(int i=n;i>=1;i--){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
