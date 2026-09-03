import java.util.*;
import java.util.stream.*;

public class CountChars
{
	public static void main(String[] args) {
	    String str = "hello world";
        
        Map<Character, Long> result = str.chars().mapToObj(s -> (char) s).filter(s -> s != ' ').collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        
		System.out.println(result);
	}
}