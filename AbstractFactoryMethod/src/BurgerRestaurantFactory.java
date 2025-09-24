public class BurgerRestaurantFactory implements RestaurantFactory {
    @Override
    public FoodOrder makeOrder() {
        return new BurgerOrder();
    }

    @Override
    public FoodSpecification createSpecification() {
        return new BeefBurgerSpecification();
    }
}