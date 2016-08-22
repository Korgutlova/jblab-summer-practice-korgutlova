package Decorator;

public class Navigator extends DecoratorCar{

    public Navigator(Car car) {
        super(car);
    }
    public double getPrice() {
        return car.getPrice() + 4000.0;
    }

    public String getDescription() {
        return car.getDescription() + " with navigator ";
    }
}
