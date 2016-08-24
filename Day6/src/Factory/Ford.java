package Factory;

public class Ford implements Car {
    private String description = "Ford.";
    private int price;

    public Ford(int price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void addInfo(String info) {
        description += " " + info;
    }
}
