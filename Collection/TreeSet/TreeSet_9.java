import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_9 {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet<Integer> treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);

        // Find numbers less than 7
        treeheadset = (TreeSet)tree_num.headSet(7);

        // Create an Iterator
        Iterator iterator;
        iterator = treeheadset.iterator();

        // Displaying the tree set data
        System.out.println("Tree Set Data: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
