import java.util.*;
import java.util.stream.*;

public class AverageStringLength
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi", "hello", "hey");
        
        double result = list.stream().collect(Collectors.averagingInt(String::length));

        System.out.println(result);
    }

}