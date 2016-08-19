public class CreditCard {
    private static CreditCard card;
    private int money = 0;

    private CreditCard() {
    }

    public static CreditCard getCard() {
        if (card == null) {
            synchronized (CreditCard.card) {
                if (card == null) {
                    card = new CreditCard();
                }
            }
        }
        return card;
    }

    public void addMoney(int x) {
        System.out.println("It was " + money);
        money += x;
        System.out.println("It is now " + money);
    }

    public int withdrawMoney(int x) {
        System.out.println("It was " + money);
        if (x > money) {
            System.out.println("Oops.Insufficient funds");
            return 0;
        }
        money -= x;
        System.out.println("Money successfully withdrawn. Left " + money);
        return x;
    }

    public void showRest() {
        System.out.println("Left " + money);
    }
}
