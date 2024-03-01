package Strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new ModelDuck();
        mallardDuck.flyBehaviour.fly();
        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.flyBehaviour.fly();
        mallardDuck.quackBehaviour.quack();
        mallardDuck.display();
    }
}
