package adv;

public class Typer extends Thread {

    static StringBuilder builder = new StringBuilder();

    char[] adv;

    Typer(String adv) {
        this.adv = adv.toCharArray();
    }

    public void run() {
        getAdv();
    }

    private void getAdv()  {
        synchronized (builder) {
            for (char item : adv) {
                System.out.print(item);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException err) {
                    err.printStackTrace();
                    break;
                }
                builder.append(item);
            }
        }
    }
}
