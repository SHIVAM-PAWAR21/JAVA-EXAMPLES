package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

    public static void main(String[] args){
        List<Integer> ls=new ArrayList<>();
        ls.add(10);
        ls.add(20);

        System.out.println(" using SOP");
        System.out.println(ls);

        System.out.println(" iterrator method from the interator interface");
        Iterator<Integer> it=ls.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(" using for each");
        for(int i:ls){
            System.out.println(i);

        }
        System.out.println(ls);

        System.out.println("the copy list");
        ArrayList<Integer> cpyls=new ArrayList<>();
        cpyls.addAll(ls);
        System.out.println("the new list "+cpyls);



    }

}
