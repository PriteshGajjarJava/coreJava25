// WAP which updates original array with logic of updating each number by it's power.
import java.util.Arrays;
public class ArrayPower {
    public static void main(String[] args) {
        int[] arr = {2,3,5,10,11};
        updateArrayElementsToItsPower(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void updateArrayElementsToItsPower(int[] a) {
        for (int i=0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }
    }
}
