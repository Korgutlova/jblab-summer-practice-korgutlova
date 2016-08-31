import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BuilderCarInvocationHandler implements InvocationHandler {
    private MyCar wrapped;

    public BuilderCarInvocationHandler(MyCar car) {
        wrapped = car;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long time = System.currentTimeMillis();
        Object dataOutput = method.invoke(wrapped, args);
        time = System.currentTimeMillis() - time;
        System.out.println(method.getName() + " spent " + time + " milliseconds!");
        return dataOutput;
    }

    public static void main(String[] args) {
        MyCar car = MyCar.newBuilder()
                .setName("Audi")
                .setPrice(15000)
                .setDescription("The last of the collection 2016!")
                .build();
        car.fix(370);
        car.addDescription("Best of all machines!");
        car.fix(1000);
        System.out.println(car);

        Car newCar = (Car) Proxy.newProxyInstance(MyCar.class.getClassLoader(), MyCar.class.getInterfaces(),
                new BuilderCarInvocationHandler(car));
        System.out.println(newCar.getName());
        newCar.go(1000);
        newCar.fix(700);
    }
}