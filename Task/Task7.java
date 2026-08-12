package Task;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        //Call each method from main and print its returned result
        System.out.println("\nOutput:");
        System.out.println("Sum: " + (int) add(num1, num2));
        System.out.println("Difference: " + (int) subtract(num1, num2));
        System.out.println("Product: " + (int) multiply(num1, num2));

        //Handle division by zero
        if (num2 == 0) {
            System.out.println("Quotient: Cannot divide by zero");
        } else {
            System.out.println("Quotient: " + (int) divide(num1, num2));
        }

        scanner.close();
    }

    //Implement 4 separate methods with an appropriate return type (not void)
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
