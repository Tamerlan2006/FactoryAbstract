public class UltrabookFactory implements LaptopFactory{
    public Laptop createLaptop() {
        return new Ultrabook();
    }
}
