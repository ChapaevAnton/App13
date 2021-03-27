package adv;

public class Typer extends Thread {

    static Adv adv;


    Typer(Adv adv) {
        this.adv = adv;
    }

    public void run() {
        getAdv(adv);

    }

    public void getAdv(Adv adv) {
        synchronized (adv) {
            for (int i = 0; i < adv.getStr().length(); i++) {
                System.out.print(adv.getStr().charAt(i));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException err) {
                    err.printStackTrace();
                }
            }
        }
    }

}

