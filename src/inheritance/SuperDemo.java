package inheritance;

class College{
    int cuid;
    College(int cid){
        System.out.println("parent");
        cuid=cid;
        System.out.println(cuid);
    }
}
class Student extends College{
int cuid;
    Student(int id,int id2){
    super(id);// for calling paramiterized constractor
        cuid=id2;
    System.out.println("child");
    System.out.println(cuid);
    System.out.println(super.cuid);

}

}
public class SuperDemo {
    public static void main(String[] args){
        Student s1=new Student(10,20);

    }
}
