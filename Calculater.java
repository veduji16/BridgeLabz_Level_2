package Level_2;

import java.util.*;

public class Calculater {

    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        return num;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int num1 = input();
        int num2 = input();
        int sum = add(num1, num2);

        System.out.println("Sum: " + sum);
    }
}