package Products;

public class Product {
    
    private String name;
    private Double price;
    
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    
    public Double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public void setPrice(Double price){
        if (price > 1) {
            this.price = price;
        }
        else{
           throw new IllegalStateException(String.format("Цена указана некорректно!",price));
        }
    }
    
    public void setName(String name) {
        this.name = name;
    }
        
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + name + '\'' +
        ", cost=" + price +
        '}';
    }
    
}
