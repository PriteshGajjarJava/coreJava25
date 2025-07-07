import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println("Reverse is: " + result);
    }

    static int reverse(int n) {
       int rev = 0;
       while (n != 0)
       {
            rev = rev * 10 +  n % 10;
            n = n / 10;
       }
       return rev;
    }
}
