public class Bank {

    Bank(){
        new Client("Иванов",this,1).start();
        new Client("Петров",this,1).start();
        new Client("Сидоров",this,1).start();
    }

    private int money = 10000;

    void takeMoney(int money) {
        this.money -= money;
    }

    void returnMoney(int money) {
        this.money += money;
    }

    int getMoney() {
        return this.money;
    }
}
