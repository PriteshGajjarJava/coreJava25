import java.util.Arrays;

public class ReverseArrayInNewArray {
    public static void main(String[] args) {
        int[] arr = { 8, 10, 7, 1, 5, 4};
        int[] output = reverse(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reverse array: " + Arrays.toString(output));
    }
    static int[] reverse(int[] a) {
        int[] b = new int[a.length]; // [0,0,0,0,0,0]
        for (int i=a.length-1, j=0; i>=0; i--, j++) {
            b[j] = a[i];
        }
        return b;
    }
}

