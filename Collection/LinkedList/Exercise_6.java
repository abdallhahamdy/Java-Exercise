import java.util.LinkedList;

public class Exercise_6 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list: " + l_list);

        // Add an element at the beginning
        l_list.addFirst("White");

        // Add an element at the end of list
        l_list.addLast("Pink");
        System.out.println("Final linked list: " + l_list);
    }
}
