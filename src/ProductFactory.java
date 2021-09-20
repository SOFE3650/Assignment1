import java.io.InputStream;
import java.util.Hashtable;
import java.util.Scanner;

public class ProductFactory implements AbstractProductFactory{

    Hashtable<String, Double> priceTable = new Hashtable<>(); //Hashtable stores prices relative to name of product

    public ProductFactory() { //Scans through pricesTable.txt and separates each line into a String and Double for the price hashtable
        InputStream input = getClass().getResourceAsStream("pricesTable.txt");
        Scanner scanner = new Scanner(input).useDelimiter("\\A");
        while (scanner.hasNextLine()) {
            String[] temp = scanner.nextLine().split("\\s+");
            priceTable.put(temp[0], Double.parseDouble(temp[1]));
        }
    }

    @Override
    public ProductA createProductA() {
        return new ProductA(priceTable.get("ProductA"));
    }

    @Override
    public ProductB createProductB() {
        return new ProductB(priceTable.get("ProductB"));
    }

}
