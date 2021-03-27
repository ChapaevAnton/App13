package fox;

// TODO: 27.03.2021 13.5 deadlock on
class Watter {
}

class Food {
}


public class Fox {

    private void foodEtt(Watter watter, Food food) {

        synchronized (food) {
            System.out.println("foodEtt->Food");
            move();

            synchronized (watter) {
                System.out.println("foodEtt->Watter");
            }
        }
    }

    private void ettFood(Watter watter, Food food) {

        synchronized (watter) {
            System.out.println("ettFood->Watter");
            move();

            synchronized (food) {
                System.out.println("ettFood->Food");
            }
        }
    }


    private void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException err) {
            err.printStackTrace();
        }
    }

    public static void main(String[] args) {


        Watter watter = new Watter();
        Food food = new Food();

        Fox fox1 = new Fox();
        Fox fox2 = new Fox();

        Thread thread = new Thread(() -> fox1.ettFood(watter, food));
        Thread thread1 = new Thread(() -> fox2.foodEtt(watter, food));

        thread.start();
        thread1.start();


    }
}
