package Exceptions;

class InvalidAge extends Exception{
    InvalidAge(String message){
        super(message);
    }
}
class demo{
    void isAgeValid(int age) throws InvalidAge{
        if (age<18){
          throw new InvalidAge("the age is invalid");
        }else{
            System.out.println("valid");
        }
    }
}

public class InvalidAgeException {

    public static void main(String[] args){
        demo obj=new demo();
        try{
           obj.isAgeValid(15);
        }
        catch (InvalidAge e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
