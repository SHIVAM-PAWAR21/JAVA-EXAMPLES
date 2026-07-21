package javaDemos;

public class ObjectClassDemo extends Object{
   /* @Override
    public boolean equals(Object obj){
      return true;
    } */
    public static void main(String[] args){
      Boolean a= false;
      Boolean b=true;
      System.out.println(b.equals(a));// we are not calling over overriden equals methods
        // we are calling the Boolean wrapper class euals beacuase its b.equals the b is a object of the Boolean class
        //and we can't extents the Boolean or any other Wrapper class beacuase its finals classes ;
        ObjectClassDemo obj1=new ObjectClassDemo();
        ObjectClassDemo obj2=new ObjectClassDemo();
        System.out.println("the diffenrt objects "+obj1.equals(obj2)); // we created diffrent object so the reference is diffrent
        // so output should be false but it gives true becuse in overriden equals we direct return true;


        ObjectClassDemo obj3=obj2;
        System.out.println("refer to same  objects "+obj2.equals(obj3));
    }
}
