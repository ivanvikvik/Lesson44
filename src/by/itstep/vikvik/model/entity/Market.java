package by.itstep.vikvik.model.entity;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Market {
    private BlockingQueue<Integer> queue;

    public Market() {
        queue = new ArrayBlockingQueue<>(1);
    }

    public int getProduct() {
        int product = 0;
        try {
            product = queue.take();
            System.out.println("get product: " + product);   // debug
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
        return product;
    }

    public void sendProduct(int product) {
        try {
            queue.put(product);
            System.out.println("send product: " + product);   // debug
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
    }
}
