package adv;

// TODO: 25.03.2021 13.3.1
public class Main {

    static Thread thread1 = new Typer("Message first.");
    static Thread thread2 = new Typer("Message second.");

    public static void main(String[] args) throws InterruptedException {


        thread1.start();
        //thread1.join();
        thread2.start();
       // thread2.join();


    }
}
