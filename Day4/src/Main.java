public class Main {
    public static void main(String[] args) {
        //first singleton
        CreditCard sberbank = CreditCard.getCard();
        sberbank.addMoney(400);
        sberbank.withdrawMoney(30);
        sberbank.withdrawMoney(500);
        sberbank.showRest();
        //second singleton
        Logger logger = Logger.getLogger();
        logger.add("Some information...");
        logger.add("Error message!!");
        logger.show();
    }
}
