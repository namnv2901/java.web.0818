package ExchangeManagement;

public class Exchange {
    private String exchangeCode;
    private String exchangeDate;
    private double unitPrice;
    private double quantity;

    public Exchange(String exchangeCode, String exchangeDate, double unitPrice, double quantity) {
        this.exchangeCode = exchangeCode;
        this.exchangeDate = exchangeDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getExchangeCode() {
        return exchangeCode;
    }

    public String getExchangeDate() {
        return exchangeDate;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public void setExchangeDate(String exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void showInfo() {
        System.out.println("Exchange code is: " + getExchangeCode());
        System.out.println("Exchange Date is: " + getExchangeDate());
        System.out.println("Unit price is: " + getUnitPrice());
        System.out.println("Quantity is: " + getQuantity());
    }

    public double intoMoney() {
        return -1;
    }

}
