package javaDemos;

public class WrapperclassDemo {
    public static void main(String[] args){
        System.out.println("hy");
        boolean a=true;
        Boolean b=true;
        System.out.println(a==b);   // it convert the wrapper to the primitive beacuase
        // == operator is used to compare reference for object and values in primitive
        //For operators like ==, +, -, *, /, %, <, >, etc.:Java prefers to work with primitives.
        // by using the autounboxing (booleanvalue(),Boolean.valueof();

        System.out.println(b.equals(a));//its work with objects so the compiler us the autobaoxing and convert the primitive to wrapper



    }

}
