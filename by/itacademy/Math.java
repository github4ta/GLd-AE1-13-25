package by.itacademy;

public class Math {
    public static int calculateTrianglePerimeter(int a, int b, int c) {
        return a + b + c;
    }

    public static int calculateRectanglePerimeter(int a, int b) {
        return 2 * (a + b);
    }

    public static double calculateTrapezoidArea(int a, int b, int height) {
        return (double) ((a + b) * height) / 2;
    }

    public static double calculateParallelogramArea(double base, double height) {
        return base * height;
    }

    public static int calculateRectangleArea(int a, int b) {
        return a * b;
    }

    public static double calculateCircleLength(int radius) {
        return 2 * java.lang.Math.PI * radius;
    }

    public static double calculateTriangleArea(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        double area = java.lang.Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    public static double calculateCircleArea(int radius) {
        return radius * radius * java.lang.Math.PI;
    }
}
