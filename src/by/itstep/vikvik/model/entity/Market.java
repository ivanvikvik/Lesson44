package by.itstep.vikvik.model.entity;

public class Market {
    private int product;
    private volatile boolean empty;

    public Market() {
        empty = true;
    }

    public synchronized int getProduct() {
        if (empty) {
            try {
                wait();
            } catch(InterruptedException exception){
                System.out.println(exception);
            }
        }

        System.out.println("get product: " + product);   // debug
        empty = true;
        notify();

        return product;
    }

    public synchronized void sendProduct(int product) {
        if (!empty) {
            try {
                wait();
            } catch(InterruptedException exception){
                System.out.println(exception);
            }
        }
        empty = false;
        this.product = product;
        System.out.println("send product: " + product);   // debug
        notify();
    }
}
