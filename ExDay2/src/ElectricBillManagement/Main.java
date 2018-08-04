package ElectricBillManagement;

public class Main {
    static Customer vnCustomer = new VietNameseCustomer("VNCus1", "Nguyen Van Ha", "11/2/2018", "Product", 7, 1, 5);
    static Customer vnCustomer2 = new VietNameseCustomer("VNCus2", "Tran Manh Thang", "11/2/2018", "Civil", 5, 1, 5);
    static Customer vnCustomer3 = new VietNameseCustomer("VNCus3", "Nguyen Van Hung", "11/2/2018", "Product", 5, 1, 5);
    static Customer fCustomer = new ForeignerCustomer("FCus1", "David", "11/2/2018", 1, 1, "USA");
    static Customer fCustomer1 = new ForeignerCustomer("FCus1", "David", "11/3/2018", 2, 1.12345, "USA");
    static Customer fCustomer2 = new ForeignerCustomer("FCus1", "David", "11/12/2018", 1.5, 2.8765, "USA");
    static Customer arrCustomer[] = {vnCustomer, fCustomer, vnCustomer2, vnCustomer3, fCustomer1, fCustomer2};

    public static void main(String[] args) {
        showInfo();
        showSumElectricityConsumption();
    }

    public static void showInfo() {
        for (int i = 0; i < arrCustomer.length; i++) {
            arrCustomer[i].showInfo();
            System.out.println("-----------------------------");
        }
    }

    public static void showSumElectricityConsumption() {
        int count = 0;
        double intoMoney = 0;
        double sumVnCustomerElectricityConsumption = 0;
        double sumForeignCustomerElectricityConsumption = 0;
        for (int i = 0; i < arrCustomer.length; i++) {
            if (arrCustomer[i] instanceof VietNameseCustomer) {
                sumVnCustomerElectricityConsumption += arrCustomer[i].getElectricityConsumption();
            }
            if (arrCustomer[i] instanceof ForeignerCustomer) {
                sumForeignCustomerElectricityConsumption += arrCustomer[i].getElectricityConsumption();
                count += 1;
                intoMoney += arrCustomer[i].intoMoney();
            }
        }
        System.out.println("Sum amount of VietNamese customer Electricity Consumption: " + sumVnCustomerElectricityConsumption);
        System.out.println("Sum amount of Foreign Customer Electricity Consumption: " + sumForeignCustomerElectricityConsumption);
        System.out.println("Average electric bill of foreign customer:  " + intoMoney / count);
    }

}
