import java.util.*;
import java.util.stream.*;

public class CommonElements
{
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(3,4,5,6);
        
        List<Integer> result = list1.stream().filter(s-> list2.contains(s)).toList();
        
        System.out.println(result);
    }

}