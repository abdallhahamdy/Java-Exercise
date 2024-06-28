public class Exercise_16 {
    public static void main(String[] args) {

        // Display a pattern to create an ASCII art representation of a simple face
        // System.out.println(" +\"\"\"\"\"+ ");
        // System.out.println("[| o o |]");
        // System.out.println(" | ^   | ");
        // System.out.println(" | '-' | ");
        // System.out.println(" +-----+ ");

        // Create an array to store lines of an ASCII art representation
        String[] arra = new String[5];

        // Populated the array with lines to form an ASCII art representation of a simple face
        arra[0] = " +\"\"\"\"\"+ ";
        arra[1] = "[| o o |]";
        arra[2] = " |  ^  |";
        arra[3] = " | '-' |";
        arra[4] = " +-----+";

        // Use a loop to print each line of the ASCII art representation
        for (int i = 0; i < 5; i++) {
            System.out.println(arra[i]);
        }
    }
}
