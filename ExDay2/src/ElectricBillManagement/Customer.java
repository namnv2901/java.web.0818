package ElectricBillManagement;

public class Customer {
    private String customerCode;
    private String customerName;
    private String date;
    private double electricityConsumption;
    private double unitPrice;


    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setElectricityConsumption(double electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public String getCustomerCode() {
        return customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return date;
    }

    public double getElectricityConsumption() {
        return electricityConsumption;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Customer(String customerCode, String customerName, String date, double unitPrice, double electricityConsumption) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.date = date;
        this.unitPrice = unitPrice;
        this.electricityConsumption = electricityConsumption;
    }

    public void showInfo() {
        System.out.println("Customer Code: " + getCustomerCode());
        System.out.println("Customer name: " + getCustomerName());
        System.out.println("Date of invoice is: " + getDate());
        System.out.println("Unit price is: " + getUnitPrice());
        System.out.println("Electricity Consumption is : " + getElectricityConsumption());
    }

    public double intoMoney() {
        return -1;
    }
}
