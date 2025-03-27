package AbstractFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println(AbstractCreditCardFactory.getCreditCardFactory(5000).getCreditCard(CardType.PLATINUM));
    }

}
