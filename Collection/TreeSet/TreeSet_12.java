import java.util.TreeSet;

public class TreeSet_12 {
    public static void main(String[] args) {
        // Creating TreeSet
        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet<Integer> treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        System.out.println("Strictly Greater than  86 : " + tree_num.higher(86));
        System.out.println("Strictly Greater than  29 : " + tree_num.higher(29));
    }
}