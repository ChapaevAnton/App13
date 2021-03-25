public class Bank {

    Bank() {
        new Client("Иванов", this, 100).start();
        new Client("Петров", this, 200).start();
        new Client("Сидоров", this, 300).start();
    }

    private static int money = 10000;

    synchronized int takeMoney(int money) {
        Bank.money -= money;
        return money;
    }

    synchronized int returnMoney(int money) {
        Bank.money += money;
        return money;
    }

    int getMoney() {
        return Bank.money;
    }
}
