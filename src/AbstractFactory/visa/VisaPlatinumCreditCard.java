package AbstractFactory.visa;

import AbstractFactory.CreditCard;

public class VisaPlatinumCreditCard extends CreditCard {

    public VisaPlatinumCreditCard() {
        setCreditCardNo(4);
        setCardHolderName("Hello");
    }
}
