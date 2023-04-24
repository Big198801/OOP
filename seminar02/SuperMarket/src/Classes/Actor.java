package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isTakeCash;
    protected boolean isMakeReturnOrder;
    
    public Actor(String name) {
        this.name = name;
    }

    public  String getName(){
        return name;
    } 

}