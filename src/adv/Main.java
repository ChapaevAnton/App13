package adv;

// TODO: 25.03.2021 13.3.1
public class Main {



    public static void main(String[] args) throws InterruptedException {

        Adv adv =  new Adv("Message first. Message second. ");
        Adv adv1 =  new Adv("Message first. Message second. ");
        Adv adv2 =  new Adv("Message first. Message second. ");

        Thread thread1 = new Typer(adv);
        Thread thread2 = new Typer(adv1);
        Thread thread3 = new Typer(adv2);
        thread1.start();
        thread2.start();
        thread3.start();



    }
}
