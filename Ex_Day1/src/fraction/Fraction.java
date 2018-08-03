package fraction;

public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction() {

    }

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public boolean isFraction(double numerator, double denominator) {
        return denominator != 0;
    }

    public String showFraction(Fraction fraction) {
        if (isFraction(fraction.getNumerator(), fraction.getDenominator())) {
            String result = fraction.getNumerator() + "/" + fraction.getDenominator();
            return result;
        }
        return null;
    }

    public static double getUCLN(double numberA, double numberB) {
        if (numberB == 0) {
            return numberA;
        }
        return getUCLN(numberB, numberA % numberB);

    }

    public static String reduceFractions(double numerator, double denominator) {
        String fraction;
        if (denominator != 0) {
            double ucln = getUCLN(numerator, denominator);

            numerator = numerator / ucln;
            denominator = denominator / ucln;
            fraction = numerator + "/" + denominator;

            return fraction;
        }
        return null;

    }

    public String doReverseFraction(double numerator, double denominator) {
        if (isFraction(this.getNumerator(), this.getDenominator())) {
            double numerator2 = denominator;
            double deminator2 = numerator;
            String result = reduceFractions(numerator2, deminator2);
            return result;
        }
        return null;

    }

    public String addFraction(Fraction fraction) {
        if (isFraction(this.getNumerator(), this.getDenominator())) {
            if (fraction.getDenominator() != 0) {
                double numerator = this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator();
                double denominator = this.getDenominator() * fraction.getDenominator();
                String result = reduceFractions(numerator, denominator);
                return result;
            }

        }
        return null;

    }

    public String subFraction(Fraction fraction) {
        if (isFraction(this.getNumerator(), this.getDenominator())) {
            if (fraction.getDenominator() != 0) {
                double numerator = this.getNumerator() * fraction.getDenominator() - fraction.getNumerator() * this.getDenominator();
                double denominator = this.getDenominator() * fraction.getDenominator();
                String result = reduceFractions(numerator, denominator);
                return result;
            }

        }
        return null;
    }

    public String mulFaction(Fraction fraction) {
        if (isFraction(this.getNumerator(), this.getDenominator())) {
            if (fraction.getDenominator() != 0) {
                double numerator = this.getNumerator() * fraction.getNumerator();
                double denominator = this.getDenominator() * fraction.getDenominator();
                String result = reduceFractions(numerator, denominator);
                return result;
            }
        }
        return null;
    }

    public String divFraction(Fraction fraction) {
        if (isFraction(this.getNumerator(), this.getDenominator())) {
            if (fraction.getDenominator() != 0) {
                double numerator = this.getNumerator() * fraction.getDenominator();
                double denominator = this.denominator * fraction.getNumerator();
                String result = reduceFractions(numerator, denominator);
                return result;
            }
        }
        return null;
    }

}

