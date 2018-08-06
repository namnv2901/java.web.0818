//Bai3
public class Triangle {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void checkTriangleType() {
		if (((a + b > c) && (a + c > b) && (b + c > a)) && ((a > 0) && (b > 0) && (c > 0))) {
			if ((a == b) && (b == c)) {
				System.out.println("is 3 sides of the equilateral triangle.");
			} else if ((a == b) || (b == c) || (a == c)) {
				System.out.println("is 3 sides of the isosceles triangle.");
			} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
				System.out.println("is 3 sides of the right triangle");
			} else {
				System.out.println("is 3 sides of the triangle.");
			}
		} else {
			System.out.println("is not 3 sides of the triangle!");
		}
	}

	public double calculateCircuit() {
		return a + b + c;
	}

	public double calculateAcreage() {
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return (double) Math.round(s * 1000) / 1000;

	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 8, 9);
		System.out.print(triangle.a + ", " + triangle.b + ", "+ triangle.c + " ");
		triangle.checkTriangleType();
		System.out.println("Circuit: " + triangle.calculateCircuit());
		System.out.println("Acreage: " + triangle.calculateAcreage());
	}

}
