package ElectricBillManagement;

public class VietNameseCustomer extends Customer {
    private String customerType;
    private double quota;

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setQuota(double quota) {
        this.quota = quota;
    }

    public String getCustomerType() {
        return customerType;
    }


    public double getQuota() {
        return quota;
    }

    public VietNameseCustomer(String customerCode, String customerName, String date, String customerType, double electricityConsumption, double unitPrice, double quota) {
        super(customerCode, customerName, date, unitPrice, electricityConsumption);
        this.customerType = customerType;
        this.quota = quota;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Type of customer is: " + getCustomerType());
        System.out.println("Electricity consumption is:  " + getElectricityConsumption());
        System.out.println("Quota is: " + getQuota());
        System.out.println("Electric bill is: " + intoMoney() + "VND");
    }

    public double intoMoney() {
        if (this.getElectricityConsumption() <= this.getQuota()) {
            return this.getElectricityConsumption() * this.getUnitPrice();
        } else {
            return this.getElectricityConsumption() * this.getUnitPrice() * this.getQuota() + ((this.getElectricityConsumption() - this.getQuota()) * this.getUnitPrice() * 2.5);
        }
    }

}
