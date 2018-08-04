package ElectricBillManagement;

public class ForeignerCustomer extends Customer {
    private String nationality;

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public ForeignerCustomer(String customerCode, String customerName, String date, double unitPrice, double getElectricityConsumption, String nationality) {
        super(customerCode, customerName, date, unitPrice, getElectricityConsumption);
        this.nationality = nationality;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Nationality is: " + getNationality());
        System.out.println("Electric bill is: " + intoMoney() + "VND");
    }

    public double intoMoney() {
        return this.getElectricityConsumption() * this.getUnitPrice();
    }

}
