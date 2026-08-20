package MULTITHREADING;

class Counter {
    private int count = 0;

    synchronized void addCount() {
        count++;
    }

    int getCount() {
        return count;
    }
}


class IncCounterDemo extends Thread {

    private final Counter target;

    IncCounterDemo(Counter target) {
        this.target = target;
    }

    @Override
    public void run() {
        target.addCount();
    }
}


public class IncCounter {

    public static void main(String[] args) {

        Counter counter = new Counter();

        IncCounterDemo[] threads = new IncCounterDemo[100];

        for (int i = 0; i < 100; i++) {

            threads[i] = new IncCounterDemo(counter);
            threads[i].setName("Thread-" + (i + 1));

            threads[i].start();
        }


        for (int i = 0; i < 100; i++) {

            try {
                threads[i].join();
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nFinal Count = " + counter.getCount());
    }
}