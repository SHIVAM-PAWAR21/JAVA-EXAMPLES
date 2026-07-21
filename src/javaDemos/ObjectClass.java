package javaDemos;

class student{
    int no=10;
    //here i override the object class equals method to compare the content not the reference
    @Override
    public boolean equals(Object obj){
        student other=(student)obj;
        return this.no==other.no;
    }
}

public class ObjectClass {
    public static void main(String[] args){
        student s1=new student();
        student s2 = new student();
          System.out.println("equals() using");
        // for the equal() method in the object class
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);




        // for the hashcode() function

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        student s3 =s2;
        System.out.println("the same reference to s3 of s2");
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
