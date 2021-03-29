package pizza;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;


public class Pizzeria {

    final long START_TIME;

    BlockingQueue<Order> listOrder = new LinkedBlockingQueue<>(2);

    Pizzeria() {
        START_TIME = System.currentTimeMillis();
        new PizzaCar().start();
        new PizzaCar().start();
    }


    class Order {

        private String namePizza;
        private long orderTime;

        Order(String namePizza, long orderTime) {
            this.namePizza = namePizza;
            this.orderTime = orderTime;

        }
    }

    class PizzaCar extends Thread {

        @Override
        public void run() {

            while (System.currentTimeMillis() - START_TIME < 5000) {
                Order order = null;

                try {
                    order = listOrder.poll(10, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    break;
                }
                if (order != null) {
                    if (System.currentTimeMillis() + 500 - START_TIME <= 750) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            break;
                        }
                        System.out.println(order.namePizza + " is delivered");
                    } else {
                        System.out.println(order.namePizza + " is NOT delivered");
                    }
                }


            }

        }

    }


    void order(String pizzaName) {
        try {
            listOrder.put(new Order(pizzaName, System.currentTimeMillis()));
        } catch (InterruptedException err) {
            err.printStackTrace();
        }
    }

}

