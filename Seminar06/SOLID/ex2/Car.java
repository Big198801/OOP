package ex2;

public class Car extends Vehicle {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);

    }

    @Override
    public int getMaxSpeed() {

        return super.getMaxSpeed();
    }

    @Override
    public String getType() {
        return super.getType();
    }

}
