import java.util.*;
import java.util.stream.*;

public class StringLength
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat", "dog", "elephant");

        Map<String, Integer> result = list.stream()
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.summingInt(String::length)));

        System.out.println(result);
    }

}