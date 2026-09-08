import java.util.*;
import java.util.stream.*;

public class DisplayDuplicates
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 1);

        List<Integer> result = list.stream().collect(Collectors.groupingBy(l -> l, Collectors.counting()))
                .entrySet().stream().filter(l -> l.getValue() > 1)
                .map(l -> l.getKey()).toList();
        System.out.println(result);
    }

}