import java.util.*;
class ReduceExample {
    public static void main(String[] args) {
        String[] arr = {"We", "are", "learning", "streaming"};

        int len = Arrays.stream(arr).map(String::length).reduce(0, (sum,e) -> sum + e);
        System.out.println(len);

        int len2= Arrays.stream(arr).mapToInt(String::length).sum();
        System.out.println(len2);

        int[] arr1 = {1,2,3,4,5};
        int sum = Arrays.stream(arr1).reduce(0, (accumulator,e) ->accumulator + e);
        System.out.println("SUM:" + sum);
    }
}
