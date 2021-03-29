package bank;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

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
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.add(new Client("Сидоров", this, 10, 0));
        baseClients.forEach(Client::start);
    }

    // TODO: 29.03.2021 13.6
    private AtomicInteger money = new AtomicInteger(10000);

    int takeMoney(int money) {
        if (getMoney() >= 0) {
            this.money.addAndGet(-money);
            return money;
        }
        return 0;
    }

    int returnMoney(Client client, int money) {
        money = (money + ((money / 100) * client.getPercent()));
        this.money.addAndGet(money);
        return money;
    }

    int getMoney() {
        return this.money.get();
    }


}
