import java.util.*;
import java.util.stream.*;

public class ReversedOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 4, 2, 3);

        List<Integer> ans = list.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(ans); // Output: [5, 4, 3, 2, 1]
    }
}