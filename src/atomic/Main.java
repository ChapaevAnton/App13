package atomic;

import java.util.concurrent.atomic.AtomicInteger;

// TODO: 29.03.2021 13.6
public class Main {

    AtomicInteger counter = new AtomicInteger();

    void setCounter() {
        counter.getAndIncrement();
    }


    void getRunning() throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                setCounter();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                setCounter();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.getRunning();

    }

}
