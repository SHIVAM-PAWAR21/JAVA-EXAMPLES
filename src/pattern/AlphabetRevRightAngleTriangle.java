package pattern;

//F
//EF
//DEF
//CDEF
//BCDEF
//ABCDEF

public class AlphabetRevRightAngleTriangle {

    public static void main(String[] args){
        pattern(6);
    }
    static void pattern(int n){
            char ch=(char)('A'+n-1);

        for(int i=1;i<=n;i++){

            char value=ch;
            for(int j=1;j<=i;j++){
                System.out.print(value++);
            }
            System.out.println();
            ch--;
        }
    }
}
