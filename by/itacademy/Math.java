package by.itacademy;

public class Math {
    public static int perimeterOfTriangle(int a, int b, int c) {
        int perimeter = a + b + c;
        System.out.println("Perimeter of triangle: " + perimeter);
        return perimeter;
    }

    public static void getAreaOfRectangle(int a, int b) {
        int p = 2 * (a + b);
        System.out.println("Периметр прямоугольника " + p);
    }

    public static double trapezoidArea(int a, int b, int height) {
        return (double) ((a + b) * height) / 2;
    }
}
