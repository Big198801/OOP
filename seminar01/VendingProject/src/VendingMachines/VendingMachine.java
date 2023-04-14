package VendingMachines;

import java.util.ArrayList;
import java.util.List;

import Products.Product;

public class VendingMachine {
    private int volume;
    private List<Product> products;
    private List<String> workLog;

    public VendingMachine(int volum){
        this.volume = volum;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();

    }
    
    public Product getproductByName(String name){
        for (Product product : products) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }
    
    public void addProduct(Product prod){
        products.add(prod);
    }

    public void addSales(String sale) {
        workLog.add(sale);
    }

    public List<Product> getProdAll()
    {
        return products;
    }
}
