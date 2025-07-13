import java.util.Arrays;
public class SwapAdjacentNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        swapAdjacent(arr);
        System.out.println("Result is: " + Arrays.toString(arr));
    }

    static void swapAdjacent(int[] a) {
        for(int i=0, j=1 ; j < a.length; i+=2, j+=2) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
