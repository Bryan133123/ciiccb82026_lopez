package Task;

import static java.lang.Math.*;

public class Task9 {

    // Requirement: add(a, b) uses addExact(a, b)
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Requirement: subtract(a, b) uses subtractExact(a, b)
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Requirement: multiply(a, b) uses multiplyExact(a, b)
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Requirement: divide(a, b) uses floorDiv(a, b) (cast/return as float per method signature)
    public static float divide(int a, int b) {
        return (float) floorDiv(a, b);
    }

    // Requirement: main calls all four methods with sample values and prints each result
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("Input values: " + x + " and " + y + "\n");
        System.out.println("Sum: " + add(x, y));
        System.out.println("Difference: " + subtract(x, y));
        System.out.println("Product: " + multiply(x, y));
        System.out.println("Quotient: " + divide(x, y));
    }
}
