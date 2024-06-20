import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input first number: ");

        // Read and store the first number
        int num1 = in.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input second number: ");

        // Read and store the second number
        int num2 = in.nextInt();

        // Calculate and print the sum of the two numbers
        // System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        int sum = num1 + num2;

        // Calculate and print the difference of the two numbers
        // System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        int minus = num1 - num2;

        // Calculate and print the product of the two numbers
        // System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        int multiply = num1 * num2;

        // Calculate and print the division of the two numbers
        // System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        int divide = num1 / num2;

        // Calculate and print the remainder of the division of the two numbers
        // System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        int rnums = num1 % num2;

        // Display the results of the calculations
        System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, divide, rnums);

    }
}
