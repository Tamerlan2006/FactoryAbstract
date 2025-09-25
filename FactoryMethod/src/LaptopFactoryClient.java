public class LaptopFactoryClient {
    public static void main(String[] args) {
        LaptopFactory factory1 = new GamingLaptopFactory();
        Laptop laptop1 = new GamingLaptop();
        laptop1.display();

        LaptopFactory factory2 = new GamingLaptopFactory();
        Laptop laptop2 = new Ultrabook();
        laptop2.display();
    }
}