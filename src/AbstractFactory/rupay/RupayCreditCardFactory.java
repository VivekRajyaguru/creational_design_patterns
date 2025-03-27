package AbstractFactory.rupay;

import AbstractFactory.AbstractCreditCardFactory;
import AbstractFactory.CardType;
import AbstractFactory.CreditCard;
import AbstractFactory.visa.VisaBasicCreditCard;
import AbstractFactory.visa.VisaPlatinumCreditCard;

public class RupayCreditCardFactory extends AbstractCreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case BASIC: return new VisaBasicCreditCard();
            case PLATINUM: return new VisaPlatinumCreditCard();
            default: throw new IllegalArgumentException("Card Type Not Matchin");
        }
    }
}
