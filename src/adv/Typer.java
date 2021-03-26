package adv;

public class Typer extends Thread {

    String adv;

    static Character item = Character.MIN_VALUE;

    Typer(String adv) {
        this.adv = adv;
    }

    public void run() {

        synchronized (item) {
            for (int i = 0; i < adv.length(); i++) {
                item = adv.charAt(i);
                System.out.print(item);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException err) {
                    err.printStackTrace();
                    break;
                }
            }
        }
    }

}

