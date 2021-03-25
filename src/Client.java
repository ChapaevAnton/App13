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
                bank.takeMoney(1000);
                bank.returnMoney(1000);
                System.out.println(this.getName());
                System.out.println(bank.getMoney());
                Thread.sleep(slp);
            } catch (InterruptedException err) {
                err.printStackTrace();
            }
        }
    }

}
