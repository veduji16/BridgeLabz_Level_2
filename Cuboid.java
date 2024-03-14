package Level_2;

import java.util.*;

// Java Program to Show the Nesting of Methods

public class Cuboid {

    public static double volume(double length, double breadth, double height) {
        double areaResult = area(length, breadth, height);
        return areaResult * height;
    }

    public static double area(double length, double breadth, double height) {
        double perimeterResult = perimeter(length, breadth, height);
        return 2 * (length * breadth + breadth * height + height * length);
    }

    public static double perimeter(double length, double breadth, double height) {
        return 4 * (length + breadth + height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length, breadth, height of the cuboid: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();

        double volumeResult = volume(length, breadth, height);

        System.out.println("Volume of the cuboid: " + volumeResult);
        sc.close();
    }
}
