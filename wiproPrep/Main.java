package wiproPrep;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int n[] = {1, 3, 5, 6, 3, 2, 3, 5, 5, 4, 3, 2};

        // Convert the array to a Set to remove duplicates and sort
        Set<Integer> sortedSet = new TreeSet<>();
        for (int num : n) {
            sortedSet.add(num);
        }
        System.out.println(sortedSet);

        // Print the sorted set
        for (int num : sortedSet) {
            System.out.print(num + " ");
        }
    }
}
