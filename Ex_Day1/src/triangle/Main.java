package triangle;

public class Main {
    static Triangle triangle = new Triangle(5, 3, 4);
    static double canhA = triangle.getCanhA();
    static double canhB = triangle.getCanhB();
    static double canhC = triangle.getCanhC();

    public static void main(String[] args) {
        showTriangleInfor();
        showPerimeter();
        showAcreage();
    }


    public static void showTriangleInfor() {

        int type = triangle.defineTypeOfTriangle(canhA, canhB, canhC);
        switch (type) {
            case 1:
                System.out.println("Tam giác deu ");
                break;
            case 2:
                System.out.println("Tam giac vuong can");
                break;
            case 3:
                System.out.println("Tam giac can");
                break;

            case 4:
                System.out.println("Tam giác vuông ");
                break;

            case 5:
                System.out.println("Tam giac thuong");
                break;

            case -1:
                System.out.println("Khong phai tam giac");
                break;

            default:
                System.out.println("Undefine!");
                break;

        }
    }

    public static void showPerimeter() {
        double perimeter = triangle.calculatePerimeter(canhA, canhB, canhC);
        if (perimeter == -1) {
            System.out.println("Null");
        } else
            System.out.println("Perimeter is: " + perimeter);
    }


    public static void showAcreage() {
        double acreage = triangle.calculateAcreage(canhA, canhB, canhC);
        if (acreage == -1) {
            System.out.println("Null");
        } else
            System.out.println("Acreage is: " + acreage);

    }

}
