package Factory;

public class CreatorFord implements CreatorCar {

    @Override
    public Car createCar(int price) {
        return new Ford(price);
    }
}
