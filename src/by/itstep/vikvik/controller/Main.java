package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.entity.Market;
import by.itstep.vikvik.model.logic.Consumer;
import by.itstep.vikvik.model.logic.Producer;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

//        TimeUnit.SECONDS.sleep(2);
//
//        producer.stop();
//        consumer.stop();

    }
}
