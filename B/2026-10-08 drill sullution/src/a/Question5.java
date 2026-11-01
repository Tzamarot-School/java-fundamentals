package a;

public class Question5 {
    public static boolean isTriangle(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public static int getTriangleType(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return 0; // No triangle
        } else {
            if (a == b && a == c) {
                return 3; //Equilateral triangle
            } else if (a == b || a == c || b == c) {
                return 2; // Isosceles triangle
            } else {
                return 1; //Scalene triangle
            }
        }
    }

    public static void printTriangleReport(int a, int b, int c) {
        System.out.print("[" + a + ", " + b + ", " + c + "] ");
        int type = getTriangleType(a, b, c);
        switch (type) {
            case 0:
                System.out.println("No triangle");
                break;
            case 1:
                System.out.println("Scalene triangle");
                break;
            case 2:
                System.out.println("Isosceles triangle");
                break;
            case 3:
                System.out.println("Equilateral triangle");
                break;
        }
    }

    public static void main(String[] args) {
        printTriangleReport(1,1,1);
        printTriangleReport(3,3,5);
        printTriangleReport(3,4,5);
        printTriangleReport(0,1,1);
        printTriangleReport(1,0,1);
        printTriangleReport(1,1,0);
    }


}
