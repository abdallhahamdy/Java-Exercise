import java.util.LinkedList;

public class Exercise_8 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list: " + l_list);

        // Add an element to front of LinkedList
        l_list.offerLast("Pink");
        System.out.println("Final linked list: " + l_list);
    }
}
