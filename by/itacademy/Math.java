package by.itacademy;

public class Math {
    public static double circleArea(double radius) {
        return radius * radius * java.lang.Math.PI;
    }

    public static int perimeterOfTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static int getAreaOfRectangle(int a, int b) {
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
}
