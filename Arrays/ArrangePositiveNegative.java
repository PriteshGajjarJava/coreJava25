import java.util.Arrays;
public class ArrangePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {1, -9, 10, 4, -2, 19, -4, -6};
        int[] res = arrangeNumbers(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("REsult array: " + Arrays.toString(res));

    }
    static int[] arrangeNumbers(int[] a) {
        Arrays.sort(a);
        //[-9, -6, -4, -2, 1, 4, 10, 19]
        System.out.println(Arrays.toString(a));
        int[] res = new int[a.length];

        for (int i= a.length/2, j=0, k=0; i < a.length; i++,j++,k+=2) {
            res[k] = a[i];
            res[k+1] = a[j];
        }
        return res;
    }
}
