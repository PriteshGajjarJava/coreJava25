import java.util.Arrays;
import java.util.Map;
import java.util.OptionalInt;
class MaxElement {
    public static void main(String[] args) {
        int[] arr = {14, 44, 1, 5, 51, 9, 8, 0};
        OptionalInt maxElement = Arrays.stream(arr).max();
        int sum = Arrays.stream(arr).sum();
        System.out.println("SUM:" + sum);
        System.out.println("Max number is: " + maxElement.getAsInt());
    }
}
