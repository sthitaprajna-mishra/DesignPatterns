package Decorator.Pizza;

public class Client {
    public static void main(String[] args) {
        // Creating a plain pizza
        IPizza plainPizza = new PlainPizza();
        System.out.println("Description: " + plainPizza.getDescription());
        System.out.println("Cost: $" + plainPizza.getCost());

        // Adding cheese to the plain pizza
        IPizza cheesePizza = new Cheese(plainPizza);
        System.out.println("Description: " + cheesePizza.getDescription());
        System.out.println("Cost: $" + cheesePizza.getCost());

        // Adding olives to the cheese pizza
        IPizza olivesAndCheesePizza = new Olives(cheesePizza);
        System.out.println("Description: " + olivesAndCheesePizza.getDescription());
        System.out.println("Cost: $" + olivesAndCheesePizza.getCost());
    }
}
