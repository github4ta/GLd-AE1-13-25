package by.itacademy;

public class Math {
    public static double triangleArea(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        double area = java.lang.Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
