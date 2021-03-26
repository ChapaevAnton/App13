package adv;

public class Typer extends Thread {

    String adv;

    static volatile Character item = Character.MIN_VALUE;

    Typer(String adv) {
        this.adv = adv;
    }

    public void run() {

        synchronized (item) {
            for (int i = 0; i < adv.length(); i++) {
                item = adv.charAt(i);
                System.out.print(item);
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException err) {
                    err.printStackTrace();
                    break;
                }
            }
        }
    }

}

