package ExchangeManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Exchange> arrExchange = new ArrayList<>();

    public static void initData() {
        Exchange exchangeGold = new GoldExchange("exG1", "11/1/2018", 11, 5, "Gold1");
        Exchange exchangeGold1 = new GoldExchange("exG2", "12/1/2018", 10, 1.5, "Gold1");
        Exchange exchangeGold2 = new GoldExchange("exG3", "13/1/2018", 10, 6.5, "Gold1");
        Exchange exchangeGold3 = new GoldExchange("exG4", "13/1/2018", 8.1, 3, "Gold2");

        Exchange exchangeCurrency = new CurrencyExchange("exC1", "11/1/2018", 12, 1, 2, "VND");
        Exchange exchangeCurrency1 = new CurrencyExchange("exC2", "11/1/2018", 2, 1, 2, "USD");
        Exchange exchangeCurrency2 = new CurrencyExchange("exC3", "11/1/2018", 3, 1, 2, "USD");
        Exchange exchangeCurrency3 = new CurrencyExchange("exC1", "11/1/2018", 4, 1, 2, "USD");
        arrExchange.add(exchangeGold);
        arrExchange.add(exchangeGold1);
        arrExchange.add(exchangeGold2);
        arrExchange.add(exchangeGold3);
        arrExchange.add(exchangeCurrency);
        arrExchange.add(exchangeCurrency1);
        arrExchange.add(exchangeCurrency2);
        arrExchange.add(exchangeCurrency3);
    }

    public static void main(String[] args) {
        initData();

        showInfo();
        showTotalQuantity();
        showAvgPriceIntoMoney();
        showBigUnitPrice();
    }

    public static void showInfo() {
        for (Exchange obj : arrExchange) {
            obj.showInfo();
            System.out.println("-----------------------------");
        }
    }

    public static void showTotalQuantity() {
        double sumGoldExchange = 0;
        double sumCurrencyExchange = 0;
        for (Exchange obj : arrExchange) {
            if (obj instanceof GoldExchange) {
                sumGoldExchange += obj.getQuantity();
            }
            if (obj instanceof CurrencyExchange) {
                sumCurrencyExchange += obj.getQuantity();
            }
        }
        System.out.println("Total quantity of gold exchange is: " + sumGoldExchange);
        System.out.println("Total quantity of currency exchange is: " + sumCurrencyExchange);

    }

    public static void showAvgPriceIntoMoney() {
        double price;
        double sumPrice = 0;
        int count = 0;
        double avgPrice = 0;
        for (Exchange obj : arrExchange) {
            if (obj instanceof CurrencyExchange) {
                count += 1;
                price = obj.intoMoney();
                sumPrice += price;
            }
            avgPrice = sumPrice / count;
        }
        System.out.println("Avg price of Currency exchange is: " + avgPrice);
    }

    public static void showBigUnitPrice() {
        System.out.println("Exchanges have big unit price is: ");
        System.out.println("---------------------------");
        for (Exchange obj : arrExchange) {
            if (obj.getUnitPrice() >= 10) {
                obj.showInfo();
                System.out.println("---------------------------");
            }
        }

    }
}
