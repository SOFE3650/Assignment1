public class ProductA implements Product {
    private final double price;

    ProductA(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
