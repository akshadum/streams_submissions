import java.util.*;
import java.util.stream.*;

public class LetterCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");

        long letterCount = list.stream().filter(s -> s.charAt(0) == 'A').count();

        System.out.println(letterCount); // Output: 3
    }
}