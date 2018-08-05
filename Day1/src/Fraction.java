//Bai 4
public class Fraction {
	private int numerator;
	private int denominator;
	public int gcd;
	public int lcm;

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public Fraction() {
	}

	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public void printFraction(int numerator, int denominator) {
		if (denominator != 0) {
			System.out.println(numerator + "/" + denominator);
		} else {
			System.out.println("Denominator = 0, does not exist the fraction ");
		}
	}

	public int findGCD(int number1, int number2) {
		if (number2 == 0) {
			return gcd = number1;
		}
		return findGCD(number2, number1 % number2);

		// for (int i = 1; i <= number1 && i <= number2; i++ ) {
		// if (number1 % i == 0 && number2 % i == 0) {
		// gcd = i;
		// }
		// }
		// return gcd;
	}

	public int findLCM(int number1, int number2) {
		findGCD(number1, number2);
		lcm = (number1 * number2) / gcd;
		return lcm;

	}

	public void simplifyFraction(int numerator, int denominator) {
		findGCD(numerator, denominator);
		if (denominator == 0) {
			System.out.println("Denominator = 0, does not exist the fraction");
		} else if (numerator == 0) {
			System.out.println("0");
		} else if (numerator == denominator) {
			System.out.println("1");
		} else {
			System.out.println((numerator / gcd) + "/" + (denominator / gcd));
		}
	}

	public void invertFraction(int numerator, int denominator) {
		int temp = 0;
		if (numerator == 0) {
			System.out.println("Numerator = 0, does not invert the fraction");
		} else {
			temp = numerator;
			numerator = denominator;
			denominator = temp;
		}
		printFraction(numerator, denominator);
	}

	public void add(int numberator1, int denominator1, int numberator2, int denominator2) {
		findLCM(denominator1, denominator2);
		int commonDenominator = lcm;
		int newNumberator = (commonDenominator * numberator1) / denominator1
				+ (commonDenominator * numberator2) / denominator2;
		System.out.printf("%d/%d + %d/%d = %d/%d \n", numberator1, denominator1, numberator2, denominator2,
				newNumberator, commonDenominator);
	}

	public void sub(int numberator1, int denominator1, int numberator2, int denominator2) {
		findLCM(denominator1, denominator2);
		int commonDenominator = lcm;
		int newNumberator = (commonDenominator * numberator1) / denominator1
				- (commonDenominator * numberator2) / denominator2;
		System.out.printf("%d/%d - %d/%d = %d/%d \n", numberator1, denominator1, numberator2, denominator2,
				newNumberator, commonDenominator);
	}

	public void mul(int numerator1, int denominator1, int numerator2, int denominator2) {
		int newNumerator = numerator1 * numerator2;
		int newDenominator = denominator1 * denominator2;

		System.out.printf("%d/%d * %d/%d = %d/%d", numerator1, denominator1, numerator2, denominator2, newNumerator,
				newDenominator);
		System.out.print(" = ");
		simplifyFraction(newNumerator, newDenominator);
	}

	public void div(int numerator1, int denominator1, int numerator2, int denominator2) {
		int temp = 0;
		temp = numerator2;
		numerator2 = denominator2;
		denominator2 = temp;

		int newNumerator = numerator1 * numerator2;
		int newDenominator = denominator1 * denominator2;
		System.out.printf("%d/%d : %d/%d = %d/%d", numerator1, denominator1, denominator2, numerator2, newNumerator,
				newDenominator);
		System.out.print(" = ");
		simplifyFraction(newNumerator, newDenominator);
	}

	public static void main(String[] args) {
		Fraction fraction = new Fraction();

		System.out.print("Fraction: ");
		fraction.printFraction(10, 145);

		System.out.print("Simplified Fraction: ");
		fraction.simplifyFraction(10, 145);

		System.out.print("Inverted Fraction: ");
		fraction.invertFraction(10, 145);

		System.out.println("==========================");
		fraction.add(1, 8, 2, 6);
		fraction.sub(2, 6, 1, 8);
		fraction.mul(2, 6, 1, 8);
		fraction.div(2, 6, 1, 8);

	}

}
