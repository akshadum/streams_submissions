import java.util.*;
import java.util.stream.*;

public class SortByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "fig", "apple", "kiwi");

        //Custom Comparator
        List<String> sorted = list.stream().sorted(Comparator.comparingInt(String::length)).toList();

        System.out.println(sorted); // Output: [fig, kiwi, apple, banana]
    }
}