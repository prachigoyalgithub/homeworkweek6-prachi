import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in degrees Fahrenheit: ");
        int fahrenheit = scanner.nextInt();

        int celsius = convertToCelsius(fahrenheit);
        System.out.println("Temperature in degrees Celsius: " + celsius + "°C");
    }

    public static int convertToCelsius(int fahrenheit) {
        // Using the formula (F - 32) * 5/9, and rounding to the nearest integer
        int celsius = Math.round((fahrenheit - 32) * 5.0f / 9.0f);
        return celsius;
    }
}
