package Factory;

public class Lada implements Car {
    private String description = "Lada.";
    private int price;

    public Lada(int price) {
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
