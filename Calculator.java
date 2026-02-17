import java.util.Scanner;
public class Calculator {
    public static int factorial (int num) {
        int result = 1;
        for (int i = num; i>=1; i--){
            result = result * i;
        }
        return result;
    }
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

        //Factorial using the function
        System.out.println("Enter number for factorial");
        int num = scanner.nextInt();

        int fact = factorial (num);
        System.out.println("Factorial: " + fact);
        // Addition and Subtraction
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();

        int sum =  number1 + number2;
        int difference =  number1 - number2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        // Power
        System.out.println("Power Function..");
        System.out.println("Enter the Base:");
        int base = scanner.nextInt();
        System.out.println("Enter the Exponent:");
        int exponent = scanner.nextInt();
        System.out.println(base+" raise to "+exponent+ "  is:  "+calculataPower(base,exponent));


        scanner.close();
    }

    public static long calculataPower(int base,int exponent){
        long result =1;
        for(int i=0;i<=exponent;i++){
            result *=base;
        }
        return result;
    }
}