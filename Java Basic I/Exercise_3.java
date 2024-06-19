import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {

        // Calculate the result of the division 50/3
        // int result = 50 / 3;

        // Print the result of the division
        // System.out.println(result);

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to the input the first number
        System.out.print("Input the first number: ");

        // Read and store the first number
        int a = input.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");

        // Read and store the second number
        int b = input.nextInt();

        // Calculate the division of a and b
        int d = (a / b);

        // Display a blank line for separation
        System.out.println();

        // Display the result of the division
        System.out.println("The division of a and b is: " + d);
    }
}
