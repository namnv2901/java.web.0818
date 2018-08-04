package ExchangeManagement;

public class CurrencyExchange extends Exchange {
    private String tyeOfMoney;
    private double exchangeRate;

    public double getExchangeRate() {
        return exchangeRate;
    }

    public String getTyeOfMoney() {
        return tyeOfMoney;
    }

    public CurrencyExchange(String exchangeCode, String exchangeDate, double unitPrice, double quantity, double exchangeRate, String tyeOfMoney) {
        super(exchangeCode, exchangeDate, unitPrice, quantity);
        this.exchangeRate = exchangeRate;
        this.tyeOfMoney = tyeOfMoney;
    }


    public void showInfo() {
        super.showInfo();
        System.out.println("Exchange rate is: " + getExchangeRate());
        System.out.println("Into Money is: " + intoMoney());
    }

    public double intoMoney() {
        String typeOfMoney = this.getTyeOfMoney();
        switch (typeOfMoney) {
            case "VND":
                return this.getQuantity() * this.getUnitPrice();
            case "USD":
                return this.getQuantity() * this.getUnitPrice() * this.getExchangeRate();
            case "EURO":
                return this.getQuantity() * this.getUnitPrice() * this.getExchangeRate();
            default:
                return 0;
        }
    }

}
