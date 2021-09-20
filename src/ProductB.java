public class ProductB implements Product{
    private final double price;

    ProductB(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
