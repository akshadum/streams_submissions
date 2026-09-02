import java.util.*;
import java.util.stream.*;

public class TotalSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int summation = list.stream().mapToInt(a -> a).sum();

        System.out.println(summation); // Output: 15
    }
}