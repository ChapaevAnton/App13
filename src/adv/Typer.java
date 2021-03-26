package adv;

public class Typer extends Thread {

    Adv adv;


    Typer(Adv adv) {
        this.adv = adv;
    }

    public void run() {

        adv.getAdv();

    }

}

