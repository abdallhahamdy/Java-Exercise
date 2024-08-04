import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.println("Number of words in the string: " + count_Words(str));
    }

    public static int count_Words(String str) {
        // Trim the string to remove leading and trailing spaces
        str = str.trim();

        // Check if the string is empty after trimming
        if (str.isEmpty()) {
            return 0;
        }

        int count = 1; // Start counting from 1 assuming there's at least one word
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') {
                System.out.println("i = " + i);
                System.out.println("str.charAt(i): " + str.charAt(i));
                System.out.println("str.charAt(i - 1): " + str.charAt(i - 1));
                count++;
                System.out.println("count inside condition: " + count);
            }

        }

        return count;
    }
}
