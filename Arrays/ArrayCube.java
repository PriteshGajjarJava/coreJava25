// Write a function which takes array as an i/p and generate new array with it's cube
import java.util.Arrays;
public class ArrayCube {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = ArrayCube.updateArrayElementsToItsCube(arr);
        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Output: " + Arrays.toString(result));
    }

    static int[] updateArrayElementsToItsCube(int[] a) {
        int b[] = new int[a.length];

        for (int i=0; i < a.length; i++) {
            b[i] = a[i] * a[i] * a[i];
        }
        return b;
    }
}
