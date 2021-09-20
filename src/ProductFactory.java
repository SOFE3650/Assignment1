import java.io.InputStream;
import java.util.Hashtable;
import java.util.Scanner;

public class ProductFactory implements AbstractProductFactory {

    //Hashtable stores prices relative to name of product
    Hashtable<String, Double> priceTable = new Hashtable<>();

    //Scans through pricesTable.txt and separates each line into a String and Double for the price hashtable
    public ProductFactory() {
        // Read the database file
        InputStream input = getClass().getResourceAsStream("pricesTable.txt");
        Scanner scanner = new Scanner(input).useDelimiter("\\A");
        while (scanner.hasNextLine()) {
            // Splits line by space character
            String[] temp = scanner.nextLine().split("\\s+");
            priceTable.put(temp[0], Double.parseDouble(temp[1]));
        }
    }

    @Override
    public ProductA createProductA() {
        // Instantiate the new product and then set its price
        ProductA newProduct = new ProductA();
        newProduct.setPrice(priceTable.get("ProductA"));
        return newProduct;
    }

    @Override
    public ProductB createProductB() {
        // Instantiate the new product and then set its price
        ProductB newProduct = new ProductB();
        newProduct.setPrice(priceTable.get("ProductB"));
        return newProduct;
    }

}
