package Decorator;

public class StandardCar implements Car {

    @Override
    public String getDescription() {
        return "New car";
    }

    @Override
    public double getPrice() {
        return 200000.0;
    }
}
