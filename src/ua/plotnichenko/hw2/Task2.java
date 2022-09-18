package ua.plotnichenko.hw2;

import java.awt.*;

public class Task2 {
    public static void main(String[] args) {
        Point A = new Point(1, 5);
        Point B = new Point(3, 5);
        Point C = new Point(6, 7);
        System.out.println("area of a triangle: "
                + Triangle.area(A, B, C));
    }
}


class Triangle {
    public static float area(Point A, Point B, Point C) {
        float area = (A.x * (B.y - C.y)
                + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f;
        return Math.abs(area);
    }
}
