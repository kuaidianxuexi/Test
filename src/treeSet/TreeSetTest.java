package treeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<String> sorter = new TreeSet<>();
        sorter.add("Bob");
        sorter.add("Amy");
        sorter.add("Carl");
        System.out.println(sorter);
    }
}
