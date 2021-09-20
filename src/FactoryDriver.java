public class FactoryDriver { //Extremely basic driver class to test functionality of creating two products

    public static void main(String args[]){
        ProductFactory productFactory = new ProductFactory();
        ProductA productA = productFactory.createProductA();
        ProductB productB = productFactory.createProductB();
        System.out.println("Product A price: "+productA.getPrice());
        System.out.println("Product B price: "+productB.getPrice());
    }
}