import java.util.*;
import java.util.stream.*;

public class FlatMap
{
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5));


        List<Integer> result = list.stream().flatMap(s->s.stream()).toList();

        System.out.println(result);
    }

}