package by.itstep.vikvik.model.logic;

import by.itstep.vikvik.model.entity.Market;

import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private Market market;
    private Thread thread;
    private volatile boolean running;

    public Consumer(Market market) {
        running = true;
        this.market = market;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (running) {
            market.getProduct();
        }
    }

    public void stop() {
        running = false;
    }
}
