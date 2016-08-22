package Decorator;

public abstract class DecoratorCar implements Car {
    protected final Car car;

    public DecoratorCar(Car car) {
        this.car = car;
    }

    @Override
    public double getPrice() {
        return car.getPrice();
    }

    @Override
    public String getDescription() {
        return car.getDescription();
    }

}
