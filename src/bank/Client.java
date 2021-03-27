package bank;

public class Client extends Thread {

    private Bank bank;
    private int slp;
    private int percent;

    Client(String name, Bank bank, int slp, int percent) {
        super(name);
        this.bank = bank;
        this.slp = slp;
        this.percent = percent;
    }

    int getPercent() {
        return percent;
    }

    public void run() {
        while (true) {

            try {
                System.out.println(this.getName() + "-взял: " + bank.takeMoney(1000));
                Thread.sleep(slp);
                System.out.println(this.getName() + "-вернул: " + bank.returnMoney(this, 1000));
                Thread.sleep(slp);
                System.out.println("баланс банка: " + bank.getMoney());

            } catch (InterruptedException err) {
                err.printStackTrace();
            }
        }

    }

}
