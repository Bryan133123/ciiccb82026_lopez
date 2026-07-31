import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Enter your first number");
        num1 = scanner.nextInt();
        System.out.println("Enter your second number");
        num2 = scanner.nextInt();
        System.out.println("Enter your third number");
        num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All number are equal");
        } 
        else if (num1 >= num2 && num1 >= num3) {
            System.out.println("First number is the largest: " + num1);
        } 
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Second number is the largest: " + num2);
        } 
        else {
            System.out.println("Third number is the largest: " + num3);
        }
        
        scanner.close();
    }
}
