package calcul;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculatrice calculator = new calculatrice();

        System.out.println("Welcome to the Basic Calculator!");

        while (true) {
            System.out.println("\nEnter an operation (+, -, *, /) or 'exit' to quit:");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the calculator...");
                break;
            }

            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double result = 0;

            try {
                switch (operation) {
                    case "+":
                        result = calculatrice.add(num1, num2);
                        break;
                    case "-":
                        result = calculatrice.subtract(num1, num2);
                        break;
                    case "*":
                        result = calculatrice.multiply(num1, num2);
                        break;
                    case "/":
                        result = calculatrice.divide(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operation!");
                        continue;
                }
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Consume newline character
            scanner.nextLine();
        }

        scanner.close();
    }
}
