package ExchangeManagement;

public class Main {
    static Exchange exchangeGold = new GoldExchange("exG1", "11/1/2018", 11, 5, "Gold1");
    static Exchange exchangeGold1 = new GoldExchange("exG2", "12/1/2018", 10, 1.5, "Gold1");
    static Exchange exchangeGold2 = new GoldExchange("exG3", "13/1/2018", 10, 6.5, "Gold1");
    static Exchange exchangeGold3 = new GoldExchange("exG4", "13/1/2018", 8.1, 3, "Gold2");

    static Exchange exchangeCurrency = new CurrencyExchange("exC1", "11/1/2018", 12, 1, 2, "VND");
    static Exchange exchangeCurrency1 = new CurrencyExchange("exC2", "11/1/2018", 2, 1, 2, "USD");
    static Exchange exchangeCurrency2 = new CurrencyExchange("exC3", "11/1/2018", 3, 1, 2, "USD");
    static Exchange exchangeCurrency3 = new CurrencyExchange("exC1", "11/1/2018", 4, 1, 2, "USD");

    static Exchange arrExchange[] = {exchangeGold, exchangeCurrency, exchangeGold1, exchangeGold2, exchangeCurrency1, exchangeCurrency2, exchangeCurrency3, exchangeGold3};

    public static void main(String[] args) {
        showInfo();
        showTotalQuantity();
        showAvgPriceIntoMoney();
        showBigUnitPrice();
    }

    public static void showInfo() {
        for (int i = 0; i < arrExchange.length; i++) {
            arrExchange[i].showInfo();
            System.out.println("-----------------------------");
        }
    }

    public static void showTotalQuantity() {
        double sumGoldExchange = 0;
        double sumCurrencyExchange = 0;
        for (int i = 0; i < arrExchange.length; i++) {
            if (arrExchange[i] instanceof GoldExchange) {
                sumGoldExchange += arrExchange[i].getQuantity();
            }
            if (arrExchange[i] instanceof CurrencyExchange) {
                sumCurrencyExchange += arrExchange[i].getQuantity();
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
        for (int i = 0; i < arrExchange.length; i++) {
            if (arrExchange[i] instanceof CurrencyExchange) {
                count += 1;
                price = arrExchange[i].intoMoney();
                sumPrice += price;
            }
            avgPrice = sumPrice / count;
        }
        System.out.println("Avg price of Currency exchange is: " + avgPrice);
    }

    public static void showBigUnitPrice() {
        System.out.println("Exchanges have big unit price is: ");
        System.out.println("---------------------------");
        for (int i = 0; i < arrExchange.length; i++) {
            if (arrExchange[i].getUnitPrice() >= 10) {
                arrExchange[i].showInfo();
                System.out.println("---------------------------");
            }
        }

    }
}
