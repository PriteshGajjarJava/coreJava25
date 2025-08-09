import java.util.Arrays;
class FilterMapDemo {
    public static void main(String[] args) {
        int[] arr = {1, 7, 10, 11, 6, 100, 54, 91, 28, 14, 7, 7, 9};

        // Print all even numbers
        int[] even = Arrays.stream(arr).filter(d -> d % 2 == 0).toArray();
        int[] odd = Arrays.stream(arr).filter(d -> d % 2 != 0).toArray();

        System.out.println("Even elements:" + Arrays.toString(even));
        System.out.println("Odd elements:" + Arrays.toString(odd));

        odd = Arrays.stream(odd).map(d -> d * d * d).toArray();
        System.out.println("Odd array with cube" + Arrays.toString(odd));

    }
}
