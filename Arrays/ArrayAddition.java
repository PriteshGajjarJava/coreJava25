
public class ArrayAddition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = ArrayAddition.getSumOfArrayElements(arr);
        System.out.println("Result is: " + result);
    }

    static int getSumOfArrayElements(int[] a) {
        int sum = 0;
        for (int data: a) {
            sum = sum + data;
        }
        return sum;
    }
}
