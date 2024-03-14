package Level_2;

public class Arithmetic_Sum {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30, num4 = 40;

        int sum1 = sum(num1, num2);
        int sum2 = sum(num1, num2, num3);
        int sum3 = sum(num1, num2, num3, num4);

        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
        System.out.println("Sum of four numbers: " + sum3);
    }
}
