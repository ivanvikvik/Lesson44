package by.itstep.vikvik.model.logic;

import by.itstep.vikvik.model.entity.Market;

import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    private Market market;
    private Thread thread;
    private volatile boolean running;

    public Producer(Market market) {
        running = true;
        this.market = market;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int product = 0;
        while (running) {
            if (market.isEmpty()) {
                product++;
                market.sendProduct(product);
                market.setEmpty(false);
            }
        }
    }

    public void stop() {
        running = false;
    }

}
