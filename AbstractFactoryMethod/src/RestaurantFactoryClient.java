public class RestaurantFactoryClient {
    public static void main(String[] args) {
        RestaurantFactory burgerFactory = new BurgerRestaurantFactory();
        FoodOrder burgerOrder = burgerFactory.makeOrder();
        FoodSpecification burgerSpec = burgerFactory.createSpecification();

        burgerOrder.cookFood();
        burgerSpec.display();

        RestaurantFactory pizzaFactory = new PizzaRestaurantFactory();
        FoodOrder pizzaOrder = pizzaFactory.makeOrder();
        FoodSpecification pizzaSpec = pizzaFactory.createSpecification();

        pizzaOrder.cookFood();
        pizzaSpec.display();
    }
}