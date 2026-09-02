import java.util.*;
import java.util.stream.*;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 9, 1, 7);

        int max = list.stream().mapToInt(a -> a).max().orElse(0);
        int min = list.stream().mapToInt(a -> a).min().orElse(0);

        System.out.println(max); // Output: 9
        System.out.println(min); // Output: 1
    }
}