import java.util.*;
import java.util.stream.*;

public class MostRepeatingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 3, 4, 2, 3, 1, 2, 2};

        Integer mostRepeating = Arrays.stream(numbers)
                .boxed() // convert int to Integer
                .collect(Collectors.groupingBy(n -> n, Collectors.counting())) // count occurrences
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()) // find max by count
                .map(Map.Entry::getKey) // get the number
                .orElse(null); // handle empty case

        System.out.println("Most repeating number: " + mostRepeating);
    }
}

