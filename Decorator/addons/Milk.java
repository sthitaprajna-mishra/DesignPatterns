package Decorator.addons;

import Decorator.Beverage;

public class Milk implements Beverage {
    Beverage b;
    public Milk(Beverage b) {
        this.b = b;
    }
    @Override
    public int getCost() {
        return 10+b.getCost();
    }
}
