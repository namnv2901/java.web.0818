package ElectricBillManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Customer> arrCustomer = new ArrayList<>();

    public static void initData() {
        Customer vnCustomer = new VietNameseCustomer("VNCus1", "Nguyen Van Ha", "11/2/2018", "Product", 7, 1, 5);
        Customer vnCustomer2 = new VietNameseCustomer("VNCus2", "Tran Manh Thang", "11/2/2018", "Civil", 5, 1, 5);
        Customer vnCustomer3 = new VietNameseCustomer("VNCus3", "Nguyen Van Hung", "11/2/2018", "Product", 5, 1, 5);
        Customer fCustomer = new ForeignerCustomer("FCus1", "David", "11/2/2018", 1, 1, "USA");
        Customer fCustomer1 = new ForeignerCustomer("FCus1", "David", "11/3/2018", 2, 1.12345, "USA");
        Customer fCustomer2 = new ForeignerCustomer("FCus1", "David", "11/12/2018", 1.5, 2.8765, "USA");
        arrCustomer.add(vnCustomer);
        arrCustomer.add(vnCustomer2);
        arrCustomer.add(vnCustomer3);
        arrCustomer.add(fCustomer);
        arrCustomer.add(fCustomer1);
        arrCustomer.add(fCustomer2);
    }

    public static void main(String[] args) {
        initData();
        showInfo();
        showSumElectricityConsumption();
    }

    public static void showInfo() {
        for (Customer obj : arrCustomer) {
            obj.showInfo();
            System.out.println("-----------------------------");
        }
    }

    public static void showSumElectricityConsumption() {
        int count = 0;
        double intoMoney = 0;
        double sumVnCustomerElectricityConsumption = 0;
        double sumForeignCustomerElectricityConsumption = 0;
        for (Customer obj : arrCustomer) {
            if (obj instanceof VietNameseCustomer) {
                sumVnCustomerElectricityConsumption += obj.getElectricityConsumption();
            }
            if (obj instanceof ForeignerCustomer) {
                sumForeignCustomerElectricityConsumption += obj.getElectricityConsumption();
                count += 1;
                intoMoney += obj.intoMoney();
            }
        }
        System.out.println("Sum amount of VietNamese customer Electricity Consumption: " + sumVnCustomerElectricityConsumption);
        System.out.println("Sum amount of Foreign Customer Electricity Consumption: " + sumForeignCustomerElectricityConsumption);
        System.out.println("Average electric bill of foreign customer:  " + intoMoney / count);
    }

}
