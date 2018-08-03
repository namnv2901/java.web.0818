package triangle;

public class Triangle {
    private double canhA;
    private double canhB;
    private double canhC;

    public Triangle(double a, double b, double c) {
        this.canhA = a;
        this.canhB = b;
        this.canhC = c;

    }

    public Triangle() {

    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }

    public double getCanhA() {
        return canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public double getCanhC() {
        return canhC;
    }

    private boolean isTriangle() {
        double sumAb = canhA + canhB;
        double sumAc = canhA + canhC;
        double sumBc = canhB + canhC;
        if (canhA > 0 && canhB > 0 && canhC > 0) {
            return (sumAb > canhC) || (sumAc > canhB) || (sumBc > canhB);
        }
        return false;
    }

    public int defineTypeOfTriangle(double canhA, double canhB, double canhC) {
        if (isTriangle()) {
            if ((canhA == canhB) && (canhA == canhC)) {
                return 1; // Tam giác đều
            }
            if (((canhA == canhB) || (canhB == canhC) || canhA == canhC) &&
                    (Math.pow(canhA, 2) == Math.pow(canhB, 2) + Math.pow(canhC, 2)
                            || Math.pow(canhB, 2) == (Math.pow(canhA, 2) + (Math.pow(canhC, 2)))
                            || ((Math.pow(canhC, 2) == Math.pow(canhB, 2) + (Math.pow(canhA, 2)))))) {
                return 2;// tam giac vuong can
            }
            if (((canhA == canhB) || (canhB == canhC) || canhA == canhC)) {
                return 3; // tam giac can
            }

            if ((Math.pow(canhA, 2) == Math.pow(canhB, 2) + Math.pow(canhC, 2)
                    || Math.pow(canhB, 2) == (Math.pow(canhA, 2) + (Math.pow(canhC, 2)))
                    || ((Math.pow(canhC, 2) == Math.pow(canhB, 2) + (Math.pow(canhA, 2)))))) {
                return 4; // tam giac vuong
            }

            return 5; // tam giac thuong
        }
        return -1;
    }

    public double calculatePerimeter(double a, double b, double c) {
        double perimeter;
        if (isTriangle()) {
            perimeter = a + b + c;
            return perimeter;
        }
        return -1;
    }

    public double calculateAcreage(double canhA, double canhB, double canhC) {
        double acreage;
        double halfPerimeter = (canhA + canhB + canhC) / 2;
        if (isTriangle()) {
            acreage = (Math.sqrt(halfPerimeter * (halfPerimeter - canhA) * (halfPerimeter - canhB) * (halfPerimeter - canhC)));
            return acreage;
        }
        return -1;
    }
}
