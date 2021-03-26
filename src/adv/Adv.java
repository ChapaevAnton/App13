package adv;

class Adv {

    String str;

    Adv(String str) {
        this.str = str;
    }

    public synchronized void getAdv() {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException err) {
                err.printStackTrace();
            }
        }
    }


}