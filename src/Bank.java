public class Bank {

    Bank() {
        new Client("Иванов", this, 1).start();
        new Client("Петров", this, 1).start();
        new Client("Сидоров", this, 1).start();
    }

    private static int money = 10000;

    int takeMoney(int money) {
        Bank.money -= money;
        return money;
    }

    int returnMoney(int money) {
        Bank.money += money;
        return money;
    }

    int getMoney() {
        return Bank.money;
    }
}
