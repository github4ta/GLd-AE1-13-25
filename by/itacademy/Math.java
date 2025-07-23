package by.itacademy;

public class Math {
    public static int perimeterOfTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static void getAreaOfRectangle(int a, int b) {
        int p = 2 * (a + b);
        System.out.println("Периметр прямоугольника " + p);
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
 }

