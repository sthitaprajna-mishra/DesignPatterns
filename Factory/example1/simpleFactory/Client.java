package Factory.example1.simpleFactory;

public class Client {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.orderBurger("veg");
        restaurant.orderBurger("chicken");
    }
}
