import java.util.Scanner;
public class UserInputArrayAddition {
    public static void main(String[] args) {
        // How to take number of elements from user and build array DYNAMICALLY
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // we will ask for actual data
        for (int i=0; i < arr.length; i++) {
            System.out.println("Enter number " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        int sum = UserInputArrayAddition.getSumOfArrayElements(arr);
        System.out.println("Sum is: " + sum);
    }

    static int getSumOfArrayElements(int[] a) {
        int sum = 0;
        for (int data: a) {
            sum = sum + data;
        }
        return sum;
    }

}
