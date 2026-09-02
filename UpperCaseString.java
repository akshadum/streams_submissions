import java.util.*;
import java.util.stream.*;

public class UpperCaseString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(upperCase); // Output: [APPLE, BANANA, CHERRY]
    }
}