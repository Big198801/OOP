package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    void setMakeReturnOrder(boolean makeReturnOrder);

    void setTakeCash(boolean takeCash);
    boolean isMakeReturnOrder();
    boolean isTakeCash();
    Actor getActor();
}
