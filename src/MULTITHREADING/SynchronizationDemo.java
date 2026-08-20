package MULTITHREADING;

class CallMe{
    //[World
    //[Synchronized
    //[Hello
    //]]]
    // the output is this because the all threads are start at aproximatly same time so it return output concurently
    //beacuse one thread print msg and sleep then other will print then it also sleep like that so we have made consistancy
    //so we use the synchronized diffrent approach


     void  call(String str){
        System.out.println("["+str);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.print("]");
    }

     //********** synchronized key word ***********
    // here we are using the ********** synchronized key word *********** to form the synchronization and make the consistancy
    //[Hello
    //][Synchronized
    //][World
    //]
    // it perform one by one now


   /* synchronized void  call(String str){
        System.out.println("["+str);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.print("]");
    }*/
}



//            *************synchronized block************
// we can use it also when we need to give the synchronization to statements

/*class Caller implements Runnable{
    String msg;
    CallMe target;
    Thread t;
    Caller(CallMe trg,String msg){
        target=trg;
        this.msg=msg;
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        target.call(msg);
    }
}*/

// here we are using the synchronized block so we main the consistancy
class Caller implements Runnable{
    String msg;
    CallMe target;
    Thread t;
    Caller(CallMe trg,String msg){
        target=trg;
        this.msg=msg;
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        synchronized(target) {
            target.call(msg);
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        CallMe call = new CallMe();

        Caller ob1 = new Caller(call, "Hello");
        Caller ob2 = new Caller(call, "Synchronized");
        Caller ob3 = new Caller(call, "World");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
