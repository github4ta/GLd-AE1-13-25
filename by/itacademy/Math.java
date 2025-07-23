package by.itacademy;

public class Math {
    public static int perimeterOfTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static int getPerimeterOfRectangle(int a, int b) {
        return 2 * (a + b);
    }

    public static double trapezoidArea(int a, int b, int height) {
        return (double) ((a + b) * height) / 2;
    }

    public static double parallelogramArea(double base, double height) {
        return base * height;
    }

    public static int rectangleArea(int a, int b) {
        return a * b;
    }

    public static double circleLength(int radius) {
        return 2 * java.lang.Math.PI * radius;
    }

    public static double triangleArea(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        double area = java.lang.Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    public static double calculateCircelrArea(int radius) {
        return radius * radius * java.lang.Math.PI;
    }
}
