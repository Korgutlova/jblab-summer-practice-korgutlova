package Factory;

public class CreatorLada implements CreatorCar {

    @Override
    public Car createCar(int price) {
        return new Lada(price);
    }
}
