package fraction;

public class Main {
    public static Fraction fraction = new Fraction(6, 3);
    public static Fraction fraction2 = new Fraction(3, 2);

    static double numerator = fraction.getNumerator();
    static double denominator = fraction.getDenominator();

    public static void main(String[] args) {

        showFractionInfo();
        showFactionAfterReduce();
        showReverseFraction();
        showAddFractionResult();
        showSubFractionResult();
        showMulFraction();
        showDivFraction();

    }

    public static void showFractionInfo() {
        String fractionInfo = fraction.showFraction(fraction);
        System.out.println("Fraction is: " + fractionInfo);
    }

    public static void showFactionAfterReduce() {
        String reduceFraction = fraction.reduceFractions(numerator, denominator);
        System.out.println("Fraction after reduce is: " + reduceFraction);
    }

    public static void showAddFractionResult() {
        String result = fraction.addFraction(fraction2);
        System.out.println("Add result is: " + result);
    }

    public static void showSubFractionResult() {
        String result = fraction.subFraction(fraction2);
        System.out.println("Sub result is: " + result);
    }

    public static void showMulFraction() {
        String result = fraction.mulFaction(fraction2);
        System.out.println("Mul result is: " + result);
    }

    public static void showDivFraction() {
        String result = fraction.divFraction(fraction2);
        System.out.println("Dev result is: " + result);
    }

    public static void showReverseFraction() {
        String reverseFraction = fraction.doReverseFraction(numerator, denominator);
        System.out.println("Fraction reversed is: " + reverseFraction);

    }

}
