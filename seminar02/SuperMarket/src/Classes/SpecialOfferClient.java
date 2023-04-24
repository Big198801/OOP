package Classes;

public class SpecialOfferClient extends Actor {
    private String OfferTitle;
    private static int numberOfSpOfCl;
    static{
        numberOfSpOfCl = 0;
    }

    public SpecialOfferClient(String name, String offerTitle) {
        super(name);
        this.OfferTitle = offerTitle;
        numberOfSpOfCl++;
    }
    
   

    public String getOfferTitle(){
        return this.OfferTitle;
    }

    public int getNumOfSpecOffCl(){
        return SpecialOfferClient.numberOfSpOfCl;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Actor getActor() {
        return this;
    }
    

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
        
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
        
    }

    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    @Override
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
      }

    @Override
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    @Override
    public boolean isTakeCash() {
       return super.isTakeCash;
    }

    

    

    

    
    
}
