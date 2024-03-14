package Level_2;

import java.util.*;

public class Area_of_Triangle_Rectangle {
    double area;
}

class Rectangle extends Area_of_Triangle_Rectangle {
    double calculateArea(double length, double breadth) {
        area = length * breadth;
        return area;
    }
}

class Triangle extends Area_of_Triangle_Rectangle {
    double calculateArea(double base, double height) {
        area = 0.5 * base * height;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of the rectangle: ");
        double lengthRectangle = sc.nextDouble();
        double breadthRectangle = sc.nextDouble();

        System.out.print("Enter base and height of the triangle: ");
        double baseTriangle = sc.nextDouble();
        double heightTriangle = sc.nextDouble();

        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        double areaRectangle = rectangle.calculateArea(lengthRectangle, breadthRectangle);
        double areaTriangle = triangle.calculateArea(baseTriangle, heightTriangle);

        System.out.println("Area of the rectangle: " + areaRectangle);
        System.out.println("Area of the triangle: " + areaTriangle);
        sc.close();
    }
}
