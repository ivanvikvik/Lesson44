package by.itstep.vikvik.controller;

import by.itstep.vikvik.model.entity.Market;
import by.itstep.vikvik.model.logic.Consumer;
import by.itstep.vikvik.model.logic.Producer;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        new Producer(market);
        new Consumer(market);

    }
}
