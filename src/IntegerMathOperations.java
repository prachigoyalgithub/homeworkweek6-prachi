import java.util.Scanner;



    public class IntegerMathOperations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the first number
            System.out.print("Input first number: ");
            int firstNumber = scanner.nextInt();

            // Input the second number
            System.out.print("Input second number: ");
            int secondNumber = scanner.nextInt();

            // Perform the operations
            int sum = firstNumber + secondNumber;
            int product = firstNumber * secondNumber;
            int difference = firstNumber - secondNumber;
            int quotient = firstNumber / secondNumber;
            int remainder = firstNumber % secondNumber;

            // Print the results
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Difference: " + difference);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);

            scanner.close();
        }
    }


