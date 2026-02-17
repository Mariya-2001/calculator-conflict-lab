import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Multiplicaion and Division
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second number");
        int num2 = scanner.nextInt();

        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);


        // Addition and Subtraction
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();

        int sum =  number1 + number2;
        int difference =  number1 - number2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);


        scanner.close();
    }
}