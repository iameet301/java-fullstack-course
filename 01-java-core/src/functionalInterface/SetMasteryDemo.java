package functionalInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMasteryDemo {
    public static void main(String[] args) {

        // 1. HashSet -> Fast, Unordered, No Duplicates
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(50);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(10); // Duplicate! Automatically ignored (returns false)
        hashSet.add(20);
        System.out.println("HashSet (Unordered):          " + hashSet);

        // 2. LinkedHashSet -> Preserves Insertion Order, No Duplicates
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(50);
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        linkedHashSet.add(10); // Duplicate! Ignored
        linkedHashSet.add(20);
        System.out.println("LinkedHashSet (Insertion):    " + linkedHashSet);

        // 3. TreeSet -> Automatically Sorted (Ascending), No Duplicates, No Nulls
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(10); // Duplicate! Ignored
        treeSet.add(20);
        System.out.println("TreeSet (Sorted Ascending):   " + treeSet);

        // 4. Using a Lambda with Set: Remove all numbers less than 25
        treeSet.removeIf(n -> n < 25);
        System.out.println("TreeSet after Lambda filter:  " + treeSet);
    }
}
