import java.util.Arrays;
public class CheckOddEven {
    public static void main(String[] args) {
        int[] arr = {10, 2, 9, 11, 21, 26, 1};
        int evenCount = CheckOddEven.getEvenCount(arr);
        int oddCount = arr.length - evenCount;
        System.out.println("Total number of even elements: " + evenCount);
        System.out.println("Total number of odd elements: " + oddCount);

       int[] e = CheckOddEven.getEvenElementsArr(arr);
       System.out.println(Arrays.toString(e));
    }

    static int[] getEvenElementsArr(int[] a) {
        int[] evenArr = new int[a.length];
        int j = 0;
        for (int i=0; i < a.length; i++) {
            if (a[i]%2==0) {
                evenArr[j] = a[i];
                j++;
            }
        }
        return Arrays.copyOf(evenArr, j);
    }
    static int getEvenCount(int[] a) {
        int cnt = 0;
        for (int data: a) {
            if (data % 2 == 0) { cnt++; }
        }
        return cnt;
    }

}
