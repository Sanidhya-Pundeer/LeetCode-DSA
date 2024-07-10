import java.util.HashSet;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        // hashSet only stores unique values
        // creating a hashset
        HashSet<Integer> set = new HashSet<>();

        // insertion
        set.add(1);
        set.add(2);

        // Search
        if (set.contains(1)) {
            System.out.println("set contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("does not contain 6");
        }

        // deletion
        set.remove(1);

        // size
        set.size();

        // iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
