package AbstractFactory.visa;

import AbstractFactory.CreditCard;

public class VisaBasicCreditCard extends CreditCard {

    public VisaBasicCreditCard() {
        setCreditCardNo(3);
        setCardHolderName("XYZ");
    }
}
