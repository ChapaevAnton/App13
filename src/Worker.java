import java.util.ArrayList;

// TODO: 25.03.2021 13.3
public class Worker {

    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();

    void addToListOne() {

        synchronized (list1) {
            for (int i = 0; i < 1_00_000; i++) {
                list1.add("One");
            }
        }
    }

    void addToListTwo() {
        synchronized (list2) {
            for (int i = 0; i < 1_00_000; i++) {
                list2.add("Two");
            }
        }
    }

    class Process extends Thread {
        public void run() {
            for (int i = 0; i < 300; i++) {
                addToListOne();
                addToListTwo();
            }

        }
    }


    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();
        Thread thread1 = worker.new Process();
        Thread thread2 = worker.new Process();

        long start = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long stop = System.currentTimeMillis();

        System.out.println("list 1 size is: " + worker.list1.size());
        System.out.println("list 2 size is: " + worker.list2.size());
        // замеряем время выполнения
        System.out.println("Time taken: " + (stop - start) + " ms");
    }
}
