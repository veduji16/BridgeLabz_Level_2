package Level_2;

import java.util.Scanner;

public class Sum_Of_Bytes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first byte value: ");
        byte byte1 = sc.nextByte();

        System.out.print("Enter the second byte value: ");
        byte byte2 = sc.nextByte();

        int int1 = byte1;
        int int2 = byte2;

        int sum = int1 + int2;

        System.out.println("Sum of " + byte1 + " and " + byte2 + " is: " + sum);
        sc.close();
    }
}
