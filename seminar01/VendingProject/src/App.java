import Products.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product("cola",100.00);
        item1.setPrice(99.00);
        

        VendingMachine itemMach1 = new VendingMachine(300);
        itemMach1.addProduct(item1);
        itemMach1.addProduct(new Product("капуччино", 120.00));
        itemMach1.addProduct(new Product("Шоколад", 90.00));
        itemMach1.addProduct(new Product("Американо", 80.00));

        for(Product prod: itemMach1.getProdAll())
        {
            System.out.println(prod);
        }
    }
}
