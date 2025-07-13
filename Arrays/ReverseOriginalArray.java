import java.util.Arrays;
public class ReverseOriginalArray {
    public static void main(String[] args) {
        int[] arr = {4, 10, 13, 9, 0, 11, -2, 19}; // [19, -2, 11, 0, 9, 13, 10, 4]
        reverse(arr);
        System.out.println("Reverse array is: " + Arrays.toString(arr));
    }

    static void reverse(int[] a) {
        for(int i=0, j=a.length-1; i<j; i++,j--) {
            // swap
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
