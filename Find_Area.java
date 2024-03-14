package Level_2;

public class Find_Area {

    public static int Area(int side) {
        return side * side;
    }

    public static double Area(double length, double breadth) {
        return length * breadth;
    }

    public static double Area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        double length = 10, breadth = 20, radius = 6.7, side = 4;

        int area1 = (int) Area(side);
        double area2 = Area(length, breadth);
        double area3 = Area(radius);

        System.out.println("Area of square: " + area1);
        System.out.println("Area of rectangle: " + area2);
        System.out.println("Area of circle: " + String.format("%.2f", area3));
    }
}
