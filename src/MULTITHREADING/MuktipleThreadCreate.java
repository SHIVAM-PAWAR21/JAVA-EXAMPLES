package MULTITHREADING;
import java.util.*;
class NewThreads implements Runnable{
    private String name;
    NewThreads(String name){
        this.name=name;
    }

    @Override
    public void run() {

        for (int i = 5; i >= 1; i--) {

            System.out.println(name + ": " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }

        System.out.println(name + " exiting");
    }

}
public class MuktipleThreadCreate {
    public static void main(String[] args) {
        Thread t1=new Thread(new NewThreads("AAA"));
        Thread t2=new Thread(new NewThreads("BBB"));
        Thread t3=new Thread(new NewThreads("CCC"));

        t1.start();
        t2.start();
        t3.start();
    }
}
