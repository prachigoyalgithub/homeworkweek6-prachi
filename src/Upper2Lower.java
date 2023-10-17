import java.util.Scanner;

public class Upper2Lower {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string in uppercase: ");
            String input = scanner.nextLine();

            String lowercase = input.toLowerCase();

            System.out.println("Converted to lowercase: " + lowercase);

            scanner.close();
        }
    }


