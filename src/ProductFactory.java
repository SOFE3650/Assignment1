public class ProductFactory implements AbstractProductFactory{
    @Override
    public ProductA createProductA() {
        return new ProductA(0);
    }

    @Override
    public ProductB createProductB() {
        return new ProductB(0);
    }
}
