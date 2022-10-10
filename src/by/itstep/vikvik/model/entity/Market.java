package by.itstep.vikvik.model.entity;

public class Market {
    private int product;
    private volatile boolean empty;

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public int getProduct() {
        System.out.println("get product: " + product);   // debug
        return product;
    }

    public void sendProduct(int product) {
        this.product = product;
        System.out.println("send product: " + product);   // debug
    }
}
