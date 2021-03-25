public class Client extends Thread {

    Bank bank;
    int slp;

    Client(String name, Bank bank, int slp) {
        super(name);
        this.bank = bank;
        this.slp = slp;
    }

    public void run() {
        while (true) {

            try {
                System.out.println(this.getName() + "-взял: " + bank.takeMoney(1000));
                Thread.sleep(slp);
                System.out.println(this.getName() + "-вернул: " + bank.returnMoney(1000));
                Thread.sleep(slp);
                System.out.println("баланс банка: " + bank.getMoney());

            } catch (InterruptedException err) {
                err.printStackTrace();
            }
        }
    }

}
