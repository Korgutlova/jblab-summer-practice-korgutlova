package Decorator;

public class Conditioner extends DecoratorCar {
    public Conditioner(Car car) {
        super(car);
    }

    public double getPrice() {
        return car.getPrice() + 5000.0;
    }

    public String getDescription() {
        return car.getDescription() + " with conditioner ";
    }
}