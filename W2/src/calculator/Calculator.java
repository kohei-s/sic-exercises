package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        int result = num1 + num2;
        System.out.println("The result is: " + result);

        System.out.println("Enter your favorite number: ");
        int num3 = scanner.nextInt();
        System.out.println("Enter your favorite number is: " + num3);

    }
}
