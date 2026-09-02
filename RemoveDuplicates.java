import java.util.*;
import java.util.stream.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> ans = list.stream().distinct().toList();

        System.out.println(ans); // Output: [1, 2, 3, 4, 5]
    }
}