package by.itacademy;

public class Math {
    public static int perimeterOfTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static void getAreaOfRectangle(int a, int b) {
        int p = 2 * (a + b);
        System.out.println("Периметр прямоугольника " + p);
    }

    public double trapezoidArea(int a, int b, int height) {
        return (double) ((a + b) * height) / 2;
    }
}
