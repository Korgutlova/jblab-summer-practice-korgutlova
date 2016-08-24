package Factory;

public class FactoryMethod {
    public static void main(String[] args) {
        Car[] cars = {new CreatorFord().createCar(300000), new CreatorLada().createCar(200000)};
        cars[1].addInfo("From new Collection!");
        for(Car x: cars){
            System.out.println(x.getDescription() + " " + x.getPrice() + " price.");
        }
    }
}
