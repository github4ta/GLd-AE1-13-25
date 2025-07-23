package by.itacademy;

public class Math {
    public static int perimeterOfTriangle(int a, int b, int c) {
        int perimeter = a + b + c;
        System.out.println("Perimeter of triangle: " + perimeter);
        return perimeter;
    }

    public static double getAreaOfRectangle(double a, double b) {
        return 2 * (a + b);
    }

    public double trapezoidArea(int a, int b, int height) {
        return (double) ((a + b) * height) / 2;
    }
}
