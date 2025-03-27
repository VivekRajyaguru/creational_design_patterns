package AbstractFactory;

public abstract class CreditCard {

    private int creditCardNo;
    private String cardHolderName;

    public int getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(int creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditCardNo=" + creditCardNo +
                ", cardHolderName='" + cardHolderName + '\'' +
                '}';
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
}
