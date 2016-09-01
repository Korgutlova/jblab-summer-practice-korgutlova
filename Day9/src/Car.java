public interface Car {
    long getPrice();
    String getName();
    String getDescription();
    void addDescription(String info);
    void go(int distance);
    void fix(int money);
}
