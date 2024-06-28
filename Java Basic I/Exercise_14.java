public class Exercise_14 {

    public static void main(String[] args) {
        // Print a pattern of asterisks and equal signs to create a design
//        System.out.println("* * * * * * =============================");
//        System.out.println("* * * * * * =============================");
//        System.out.println("* * * * * * =============================");
//        System.out.println("* * * * * * =============================");
//        System.out.println("* * * * * * =============================");
//        System.out.println("* * * * * * =============================");
//        System.out.println("* * * * * * =============================");
//        System.out.println("* * * * * * =============================");
//        System.out.println("* * * * * * =============================");
//
//        // Print a row of equal signs to complete the design
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("==========================================");

        // Define pattern strings for the top
        String p1 = "* * * * * * ===============================\n * * * * * * ===========================================";
        String p2 = "-------------------------------------------";
        // Print the top section pattern 4 times
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        // Print the bottom section pattern once
        System.out.println("* * * * * * =======================");
        // Print the middle section pattern 6 times
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
