package Decorator.addons;

import Decorator.Beverage;

public class Whip implements Beverage {
    Beverage b;
    public Whip(Beverage b) {
        this.b = b;
    }
    @Override
    public int getCost() {
        return 15 + b.getCost();
    }
}
