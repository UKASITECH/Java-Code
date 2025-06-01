import java.util.HashSet; 
import java.util.TreeSet;
public class SetExamples {
    public static void main(String[] args) {
        // Demonstrating the use of HashSet
        System.out.println("HashSet Example:");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate entry, will not be added

        // Displaying the elements of HashSet
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Demonstrating the use of TreeSet
        System.out.println("\nTreeSet Example:");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);

        // Displaying the elements of TreeSet (sorted order)
        for (Integer number : treeSet) {
            System.out.println(number);
        }

        // Demonstrating the unique properties of sets
        System.out.println("\nSet Properties:");
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));
        System.out.println("Contains 'Grapes': " + hashSet.contains("Grapes"));
    }
}