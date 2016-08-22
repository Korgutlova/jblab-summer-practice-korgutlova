package Decorator;

public class Main {
    public static void main(String[] args) {
        Car carOne = new StandardCar();
        System.out.println(carOne.getPrice());
        Car carTwo = new Conditioner(new Navigator(new StandardCar()));
        System.out.println(carTwo.getPrice());
        System.out.println(carTwo.getDescription());
    }
}

