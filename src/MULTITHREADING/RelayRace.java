package MULTITHREADING;
import java.util.*;

class Runners extends Thread{

    @Override
    public void run(){
        long start=System.nanoTime();
        System.out.println(getName()+" started");

        try{
            //Thread.sleep(1000);  // used for contant runner time
            Random random=new Random();
           Thread.sleep(random.nextInt(3000));
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        long end=System.nanoTime();
        System.out.println(getName() +" finised in "+(end-start)/1_000_000 + "ms");
    }
}
public class RelayRace {
    public static void main(String[] args) throws Exception{
     Runners r1=new Runners();
        Runners r2=new Runners();
        Runners r3=new Runners();
        r1.setName("DIPAK");
        r2.setName("BHAU");
        r3.setName("SHIVAM");

        long starting=System.nanoTime();

        r1.start();
        r1.join();

        r2.start();
        r2.join();

        r3.start();
        r3.join();

        long ending=System.nanoTime();

        System.out.println("\n total time to end the race: "+(ending-starting)/1_000_000 +"ms");
    }
}
