package adv;

// TODO: 25.03.2021 13.3.1
public class Main {



    public static void main(String[] args) throws InterruptedException {

        Adv adv =  new Adv("Message first. Message second. ");


        Thread thread1 = new Typer(adv);
        Thread thread2 = new Typer(adv);
        thread1.start();
        //thread1.join();
        thread2.start();
        //thread2.join();


    }
}
