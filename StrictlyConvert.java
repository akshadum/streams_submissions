import java.util.*;
import java.util.stream.*;

public class StringConvert
{
	public static void main(String[] args) {
	    List<String> list = Arrays.asList("Red", "Green", "Blue");
        
        String ans = list.stream().collect(Collectors.joining(", "));
        
		System.out.println(ans);
	}
}