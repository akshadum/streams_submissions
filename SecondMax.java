import java.util.*;
import java.util.stream.*;

public class SecondMax
{
	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(10, 20, 4, 45, 99, 99);
        
        int ans = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        
		System.out.println(ans);
	}
}