import java.util.Scanner;

public class Exercise_15 {

    public static void main(String[] args) {
        // Declare variables for the values to be swapped
        // int a, b, temp;

        // Declare and initialize integer variables
        // int a, b;
        // a = 15;
        // b = 27;

        // Declare integer variables for storing user input and swapping
        int x, y, z;

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.println("Input the first number: ");
        x = in.nextInt();

        // Prompt the user to input the second number
        System.out.println("Input the second number: ");
        y = in.nextInt();

        // Perform the swap using a temporary variable 'z'
        z = x;
        x = y;
        y = z;

        // Display the swapped values
        System.out.println("Swapped values are: " + x + " and " + y);

        // Assign values to variables a and b
        // a = 15;
        // b = 27;

        // Print the values before swapping
        // System.out.println("Before swapping : a, b = " + a + ", " + b);

        // Perform the swap using a temporary variable
        // temp = a;
        // a = b;
        // b = temp;

        // Perform the swap without using a temporary variable
        // a = a + b;  // Add a and b and store the result in a
        // b = a - b; // Subtract the original b from the new a and store the result in b
        // a = a - b; // Subtract the new b from the updated a and store the result in a


        // Print the values after swapping
        // System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}
