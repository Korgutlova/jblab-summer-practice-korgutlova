public class MyCar implements Car {
    private long price;
    private String name;
    private String description;

    private MyCar() {
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public long getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void addDescription(String info) {
        description = description + " " + info;
    }

    @Override
    public void go(int distance) {
        for (int i = 0; i < distance; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.println("I drove " + i + " kilometers!");
            }
        }
        System.out.println("I drove all the way: " + distance + " kilometers!");
    }

    @Override
    public void fix(int money) {
        int service = 500;
        if (service <= money) {
            System.out.println("The car successfully drove to the service station!");
        } else {
            System.out.println("Sorry, not enough $ " + (service - money) + " !");
        }
    }

    public static CarBuilder newBuilder() {
        return new MyCar().new CarBuilder();
    }

    public class CarBuilder {
        private CarBuilder() {
        }

        public CarBuilder setPrice(long price) {
            MyCar.this.price = price;
            return this;
        }

        public CarBuilder setDescription(String description) {
            MyCar.this.description = description;
            return this;
        }

        public CarBuilder setName(String name) {
            MyCar.this.name = name;
            return this;
        }

        public MyCar build() {
            return MyCar.this;
        }
    }
}
