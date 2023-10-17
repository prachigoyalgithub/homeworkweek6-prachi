import java.util.Scanner;

public class AverageCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = scanner.nextInt();

            System.out.print("Enter the third number: ");
            int number3 = scanner.nextInt();

            int average = (number1 + number2 + number3) / 3;

            System.out.println("The average of the three numbers is: " + average);

            scanner.close();
        }
    }


