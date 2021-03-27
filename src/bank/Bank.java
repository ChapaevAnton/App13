package bank;

import java.util.ArrayList;

public class Bank {

    ArrayList<Client> baseClients = new ArrayList<>();

    Bank() {
        baseClients.add(new Client("Иванов", this, 10, 0));
        baseClients.add(new Client("Иванов", this, 10, 0));
        baseClients.add(new Client("Иванов", this, 10, 0));
        baseClients.add(new Client("Иванов", this, 10, 0));
        baseClients.add(new Client("Иванов", this, 10, 0));
        baseClients.add(new Client("Иванов", this, 10, 0));
        baseClients.add(new Client("Иванов", this, 10, 0));
        baseClients.add(new Client("Петров", this, 10, 0));
        baseClients.add(new Client("Петров", this, 10, 0));
        baseClients.add(new Client("Петров", this, 10, 0));
        baseClients.add(new Client("Петров", this, 10, 0));
        baseClients.add(new Client("Петров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.forEach(Client::start);
    }

    private static int money = 10000;

    synchronized int takeMoney(int money) {
        if (getMoney() >= 0) {
            Bank.money -= money;
            return money;
        }
        return 0;
    }

    synchronized int returnMoney(Client client, int money) {
        money = (money + ((money / 100) * client.getPercent()));
        Bank.money += money;
        return money;
    }

    int getMoney() {
        return Bank.money;
    }


}
