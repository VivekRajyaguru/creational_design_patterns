package AbstractFactory;

import AbstractFactory.rupay.RupayCreditCardFactory;
import AbstractFactory.visa.VisaCreditCardFactory;

public abstract class AbstractCreditCardFactory {


    public static AbstractCreditCardFactory getCreditCardFactory(int creditRating) {
        if (creditRating > 2000) {
            return new RupayCreditCardFactory();
        } else {
            return new VisaCreditCardFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);
}
