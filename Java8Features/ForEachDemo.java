// Stream -> forEach() function (java 8)
import java.util.Arrays;
class ForEachDemo {
    public static void main(String[] args) {
        String directions[] = {"North", "East", "West", "South"};
        // convert array into stream
        Arrays.stream(directions).forEach(direction -> System.out.println(direction));
    }
}

