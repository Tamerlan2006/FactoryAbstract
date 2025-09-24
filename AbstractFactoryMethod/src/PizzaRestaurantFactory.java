public class PizzaRestaurantFactory implements RestaurantFactory {
    @Override
    public FoodOrder makeOrder() {
        return new PizzaOrder();
    }

    @Override
    public FoodSpecification createSpecification() {
        return new PepperoniPizzaSpecification();
    }
}