import java.util.Scanner;

public class Lowercase2Uppercase {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the string
            System.out.print("Input a string: ");
            String inputString = scanner.nextLine();

            // Convert the string to lowercase
            String lowercaseString = inputString.toLowerCase();

            System.out.println("Lowercase String: " + lowercaseString);

            scanner.close();
        }
    }



