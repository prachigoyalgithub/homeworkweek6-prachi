import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        int base = scanner.nextInt();

        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        // Close the scanner to free up resources
        scanner.close();

        // Calculate the area of the triangle
        int area = (base * height) / 2;

        // Display the result
        System.out.println("The area of the triangle is: " + area);
    }
}

