import java.util.*;
import java.util.stream.*;

public class StrictlyGreater {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 7, 10, 15, 20);

        int element = list.stream().filter(n -> n > 10).findFirst().orElse(0);

        System.out.println(element); // Output: 15
    }
}