import java.util.*;
import java.util.stream.*;

public class SortedAlphabetically {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cherry");

        List<String> sorted = list.stream().sorted().toList();

        System.out.println(sorted); // Output: [ "apple", "banana", "cherry"]
    }
}