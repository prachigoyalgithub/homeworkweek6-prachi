public class Calculator {

        // Static method for addition
        public static void add(int num1, int num2) {
            int result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        }

        // Static method for subtraction
        public static void subtract(int num1, int num2) {
            int result = num1 - num2;
            System.out.println( num1 + " - " + num2 + " = " + result);
        }

        // Instance method for multiplication
        public void multiply(int num1, int num2) {
            int result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }

        // Instance method for division
        public void divide(int num1, int num2) {
            if (num2 == 0) {
                System.out.println( "Cannot divide by zero!");
            }

            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        }

        public static void main(String[] args) {
            Calculator Obj = new Calculator();

            // Using static methods
            Calculator.add(15, 30);
            Calculator.subtract(5, 3);

            // Using instance methods
            Obj.multiply(5, 3);
            Obj.divide(15, 3);
        }
    }




