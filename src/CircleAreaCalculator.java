import java.util.Scanner;

public class CircleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        int radius = scanner.nextInt();

         calculateArea(radius);
        //System.out.println("The area of the circle is: " + area);
    }

    public static void calculateArea(int radius) {
        // Using the formula A = π * r * r
        double pi = 3.14159; // An approximation of π
        int area = (int) (pi * radius * radius); // Cast the result to int
        System.out.println(area);
    }
}
