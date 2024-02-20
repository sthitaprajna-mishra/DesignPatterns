package Decorator.addons;

import Decorator.Beverage;

public class Mocha implements Beverage {
    Beverage b;
    public Mocha(Beverage b) {
        this.b = b;
    }
    @Override
    public int getCost() {
        return 20 + b.getCost();
    }
}
