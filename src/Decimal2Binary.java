import java.util.Scanner;

public class Decimal2Binary {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the decimal number
            System.out.print("Input a Decimal Number: ");
            int decimalNumber = scanner.nextInt();

            // Use the Integer.toBinaryString() method to convert to binary
            String binaryNumber = Integer.toBinaryString(decimalNumber);

            System.out.println("Binary Number: " + binaryNumber);

            scanner.close();
        }
    }


