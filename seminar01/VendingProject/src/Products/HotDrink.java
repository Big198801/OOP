package Products;

/** 
* Класс для горячих напитков
*/
public class HotDrink extends Product{
    /** температура горячего напитка*/
    private int tempreture;
    /** объем напитка */
    private int volume;
    
    /**
     * Конструктор Горячего напитка
     * @param name Наименование
     * @param price Цена   
     * @param temp Температура напитка
     * @param volume Объем напитка
     */
    public HotDrink(String name, double price, int temp, int volume) {
        super(name, price);
        this.tempreture = temp;
        this.volume = volume;
    }

    /** метод, позволяющий получить температуру горячего напитка
     * @return температуру
    */
    public int getTempreture() {
        return tempreture;        
    }
 
    /**
     * метод, позволяющий изменить температуру горячего напитка
     * @param tempreture выставляемая температура
     */
    public void setTempreture(int tempreture) {
        this.tempreture = tempreture;
    }

    /**
     * метод, позволяющий получить объем горячего напитка
     * @return  объем
     */
    public int getVolume() {
        return volume;
    }

    /**
     * метод, позволяющий изменить объем горячего напитка
     * @param volume задаем значение объема
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /** Метод, позволяющий  Наименование Горячего напитка*/
    @Override
    public String getName() {
        return super.getName();
    }

    /**метод, позволяющий вернуть Стоимость горячего напитка */
    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString() {
        return  "Product{" +
        "name = '" + getName() + '\'' +
        ", cost = " + getPrice() +
        ", tempreture = " + tempreture +  
        ", volume = " + volume + '}';       
    }    
}
