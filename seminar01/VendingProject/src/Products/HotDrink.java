package Products;

public class HotDrink extends Product {
    public int tempreture;
    
    public HotDrink(String name, double price, int temp){
        super(name, price);
        this.tempreture = temp;
    }

    
    @Override
    public String toString() {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", tempreture=" + tempreture +
        '}';
        
    }
}
