package ExchangeManagement;

public class GoldExchange extends Exchange {
    private String typeOfGold;

    public GoldExchange(String exchangeCode, String exchangeDate, double unitPrice, double quantity, String typeOfGold) {
        super(exchangeCode, exchangeDate, unitPrice, quantity);
        this.typeOfGold = typeOfGold;
    }

    public String getTypeOfGold() {
        return typeOfGold;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Type of gold is: " + getTypeOfGold());
        System.out.println("Into Money is: " + intoMoney());
    }

    public double intoMoney() {
        return this.getUnitPrice() * this.getQuantity();
    }
}
