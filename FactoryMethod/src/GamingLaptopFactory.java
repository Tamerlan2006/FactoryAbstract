public class GamingLaptopFactory implements LaptopFactory {
    public Laptop createLaptop() {
        return new GamingLaptop();
    }
}
