package pattern;
//A
//AB
//ABC
//ABCD
//ABCDE
//ABCDEF

public class AlphabetsRightAngleTriangle {
    public static void main(String[] args){
        pattern(6);
    }
    static void pattern(int n){

        for(int i=1;i<=n;i++){
            //int value=65;
            char ch='A';
            for(int j=1;j<=i;j++){

               // System.out.print((char)value++);
                System.out.print(ch++);
            }
            System.out.println();


        }

    }
}
