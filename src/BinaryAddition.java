import java.util.Scanner;

    public class BinaryAddition {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the first binary number as a string
            System.out.print("Input first binary number: ");
            String binary1 = scanner.next();

            // Input the second binary number as a string
            System.out.print("Input second binary number: ");
            String binary2 = scanner.next();

            // Convert binary numbers to decimal
            int decimal1 = Integer.parseInt(binary1, 2);
            int decimal2 = Integer.parseInt(binary2, 2);

            // Add the decimal values
            int sum = decimal1 + decimal2;

            // Convert the result back to binary
            String binarySum = Integer.toBinaryString(sum);

            System.out.println("Binary Sum: " + binarySum);

            scanner.close();
        }
    }


